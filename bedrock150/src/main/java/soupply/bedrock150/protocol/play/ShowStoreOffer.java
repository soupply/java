package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ShowStoreOffer extends soupply.bedrock150.Packet
{

    public static final int ID = 91;

    public String unknown0;
    public boolean unknown1;
    public String unknown2;

    public ShowStoreOffer()
    {
    }

    public ShowStoreOffer(String unknown0, boolean unknown1, String unknown2)
    {
        this.unknown0 = unknown0;
        this.unknown1 = unknown1;
        this.unknown2 = unknown2;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] d5b9ba = _buffer.convertString(unknown0);
        _buffer.writeVaruint((int)d5b9ba.length);
        _buffer.writeBytes(d5b9ba);
        _buffer.writeBool(unknown1);
        byte[] d5b9bi = _buffer.convertString(unknown2);
        _buffer.writeVaruint((int)d5b9bi.length);
        _buffer.writeBytes(d5b9bi);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvd5b9ba = _buffer.readVaruint();
        unknown0 = _buffer.readString(bvd5b9ba);
        unknown1 = _buffer.readBool();
        final int bvd5b9bi = _buffer.readVaruint();
        unknown2 = _buffer.readString(bvd5b9bi);
    }

    public static ShowStoreOffer fromBuffer(byte[] buffer)
    {
        ShowStoreOffer packet = new ShowStoreOffer();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
