package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class PhotoTransfer extends soupply.bedrock150.Packet
{

    public static final int ID = 99;

    public String unknown0;
    public String unknown1;
    public String unknown2;

    public PhotoTransfer()
    {
    }

    public PhotoTransfer(String unknown0, String unknown1, String unknown2)
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
        byte[] d5b9be = _buffer.convertString(unknown1);
        _buffer.writeVaruint((int)d5b9be.length);
        _buffer.writeBytes(d5b9be);
        byte[] d5b9bi = _buffer.convertString(unknown2);
        _buffer.writeVaruint((int)d5b9bi.length);
        _buffer.writeBytes(d5b9bi);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvd5b9ba = _buffer.readVaruint();
        unknown0 = _buffer.readString(bvd5b9ba);
        final int bvd5b9be = _buffer.readVaruint();
        unknown1 = _buffer.readString(bvd5b9be);
        final int bvd5b9bi = _buffer.readVaruint();
        unknown2 = _buffer.readString(bvd5b9bi);
    }

    public static PhotoTransfer fromBuffer(byte[] buffer)
    {
        PhotoTransfer packet = new PhotoTransfer();
        packet.safeDecode(buffer);
        return packet;
    }

}
