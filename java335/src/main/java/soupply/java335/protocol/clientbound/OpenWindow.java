package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class OpenWindow extends soupply.java335.Packet
{

    public static final int ID = 19;

    public byte window;
    public String type;
    public String title;
    public byte slots;

    public OpenWindow()
    {
    }

    public OpenWindow(byte window, String type, String title, byte slots)
    {
        this.window = window;
        this.type = type;
        this.title = title;
        this.slots = slots;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        byte[] dlz = _buffer.convertString(type);
        _buffer.writeVaruint((int)dlz.length);
        _buffer.writeBytes(dlz);
        byte[] dlbu = _buffer.convertString(title);
        _buffer.writeVaruint((int)dlbu.length);
        _buffer.writeBytes(dlbu);
        _buffer.writeByte(slots);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        final int bvdlz = _buffer.readVaruint();
        type = _buffer.readString(bvdlz);
        final int bvdlbu = _buffer.readVaruint();
        title = _buffer.readString(bvdlbu);
        slots = _buffer.readByte();
    }

    public static OpenWindow fromBuffer(byte[] buffer)
    {
        OpenWindow packet = new OpenWindow();
        packet.safeDecode(buffer);
        return packet;
    }

}
