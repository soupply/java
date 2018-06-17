package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Teams extends soupply.java210.Packet
{

    public static final int ID = 65;

    public String name;
    public byte mode;

    public Teams()
    {
    }

    public Teams(String name, byte mode)
    {
        this.name = name;
        this.mode = mode;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeByte(mode);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        mode = _buffer.readByte();
    }

    public static Teams fromBuffer(byte[] buffer)
    {
        Teams packet = new Teams();
        packet.safeDecode(buffer);
        return packet;
    }

}
