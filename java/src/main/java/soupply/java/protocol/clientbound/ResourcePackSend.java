package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ResourcePackSend extends soupply.java.Packet
{

    public static final int ID = 52;

    public String url;
    public String hash;

    public ResourcePackSend()
    {
    }

    public ResourcePackSend(String url, String hash)
    {
        this.url = url;
        this.hash = hash;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] djdj = _buffer.convertString(url);
        _buffer.writeVaruint((int)djdj.length);
        _buffer.writeBytes(djdj);
        byte[] afa = _buffer.convertString(hash);
        _buffer.writeVaruint((int)afa.length);
        _buffer.writeBytes(afa);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvdj = _buffer.readVaruint();
        url = _buffer.readString(bvdj);
        final int bvafa = _buffer.readVaruint();
        hash = _buffer.readString(bvafa);
    }

    public static ResourcePackSend fromBuffer(byte[] buffer)
    {
        ResourcePackSend packet = new ResourcePackSend();
        packet.safeDecode(buffer);
        return packet;
    }

}
