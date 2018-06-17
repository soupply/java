package soupply.test0;

import soupply.util.Buffer;
import soupply.util.BufferOverflowException;

public abstract class Packet extends soupply.util.Packet
{

    public abstract byte getId();

    @Override
    public byte[] encode()
    {
        Buffer _buffer = new Buffer();
        _buffer.writeByte(this.getId());
        this.encodeBody(_buffer);
        return _buffer.toByteArray();
    }

    @Override
    public void decode(byte[] data) throws BufferOverflowException
    {
        Buffer _buffer = new Buffer(data);
        final int _id = _buffer.readByte();
        this.decodeBody(_buffer);
    }

}
