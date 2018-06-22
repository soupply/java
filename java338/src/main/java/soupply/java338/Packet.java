package soupply.java338;

import soupply.util.Buffer;
import soupply.util.DecodeException;

public abstract class Packet extends soupply.util.Packet
{

    public abstract int getId();

    @Override
    public byte[] encode()
    {
        Buffer _buffer = new Buffer();
        _buffer.writeVaruint(this.getId());
        this.encodeBody(_buffer);
        return _buffer.toByteArray();
    }

    @Override
    public void decode(byte[] data) throws DecodeException
    {
        Buffer _buffer = new Buffer(data);
        final int _id = _buffer.readVaruint();
        this.decodeBody(_buffer);
    }

}
