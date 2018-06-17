package soupply.test0;

import soupply.util.Buffer;
import soupply.util.BufferOverflowException;

public abstract class Packet extends soupply.util.Packet
{

    public abstract byte getId();

    @Override
    public byte[] encode()
    {
        Buffer buffer = new Buffer();
        _buffer.writeByte(this.getId());
        this.encodeBody(buffer);
        return buffer.toByteArray();
    }

    @Override
    public void decode(byte[] _buffer) throws BufferOverflowException
    {
        Buffer buffer = new Buffer(_buffer);
        final int _id = _buffer.readByte();
        this.decodeBody(buffer);
    }

}
