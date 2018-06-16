package soupply.bedrock201;

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
    }

    @Override
    public void decode(byte[] _buffer)
    {
        Buffer buffer = new Buffer(_buffer);
        buffer.readVaruint();
        buffer.readBytes(2);
        this.decodeBody(buffer);
    }

}
