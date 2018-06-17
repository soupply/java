package soupply.java340;

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
        this.encodeBody(buffer);
        return buffer.toByteArray();
    }

    @Override
    public void decode(byte[] _buffer) throws BufferOverflowException
    {
        Buffer buffer = new Buffer(_buffer);
        buffer.readVaruint();
        this.decodeBody(buffer);
    }

}
