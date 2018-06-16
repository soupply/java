package soupply.java210;

public abstract class Packet extends soupply.util.Packet
{

    public abstract int getId();

    @Override
    public byte[] encode()
    {
        Buffer buffer = new Buffer();
        buffer.writeVaruint(this.getId());
        this.encodeBody(buffer);
    }

    @Override
    public void decode(byte[] _buffer)
    {
        Buffer buffer = new Buffer(_buffer);
        buffer.readVaruint();
        this.decodeBody(buffer);
    }

}
