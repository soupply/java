package soupply.bedrock150;

import soupply.util.Buffer;
import soupply.util.BufferOverflowException;

public abstract class Packet extends soupply.util.Packet
{

    public abstract int getId();

    @Override
    public byte[] encode()
    {
        Buffer _buffer = new Buffer();
        _buffer.writeVaruint(this.getId());
        _buffer.writeBytes(new byte[2]);
        this.encodeBody(_buffer);
        return _buffer.toByteArray();
    }

    @Override
    public void decode(byte[] data) throws BufferOverflowException
    {
        Buffer _buffer = new Buffer(data);
        final int _id = _buffer.readVaruint();
        _buffer.readBytes(2);
        this.decodeBody(_buffer);
    }

}
