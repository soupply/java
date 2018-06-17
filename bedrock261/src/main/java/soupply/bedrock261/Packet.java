package soupply.bedrock261;

import soupply.util.Buffer;
import soupply.util.BufferOverflowException;

public abstract class Packet extends soupply.util.Packet
{

    public abstract int getId();

    @Override
    public byte[] encode()
    {
        Buffer buffer = new Buffer();
        buffer.writeVaruint(this.getId());
        buffer.writeBytes(new byte[2]);
        this.encodeBody(buffer);
        return buffer.toArray();
    }

    @Override
    public void decode(byte[] _buffer) throws BufferOverflowException
    {
        Buffer buffer = new Buffer(_buffer);
        buffer.readVaruint();
        buffer.readBytes(2);
        this.decodeBody(buffer);
    }

}
