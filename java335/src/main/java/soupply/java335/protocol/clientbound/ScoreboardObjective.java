package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ScoreboardObjective extends soupply.java335.Packet
{

    public static final int ID = 65;

    // mode
    public static final byte CREATE = (byte)0;
    public static final byte REMOVE = (byte)1;
    public static final byte UPDATE = (byte)2;

    // type
    public static final String NUMERIC = "integer";
    public static final String GRAPHIC = "hearts";

    public String name;
    public byte mode;
    public String value;
    public String type;

    public ScoreboardObjective()
    {
    }

    public ScoreboardObjective(String name, byte mode, String value, String type)
    {
        this.name = name;
        this.mode = mode;
        this.value = value;
        this.type = type;
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
        if(mode!=1)
        {
            byte[] dfdu = _buffer.convertString(value);
            _buffer.writeVaruint((int)dfdu.length);
            _buffer.writeBytes(dfdu);
            byte[] dlz = _buffer.convertString(type);
            _buffer.writeVaruint((int)dlz.length);
            _buffer.writeBytes(dlz);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        mode = _buffer.readByte();
        if(mode!=1)
        {
            final int bvdfdu = _buffer.readVaruint();
            value = _buffer.readString(bvdfdu);
            final int bvdlz = _buffer.readVaruint();
            type = _buffer.readString(bvdlz);
        }
    }

    public static ScoreboardObjective fromBuffer(byte[] buffer)
    {
        ScoreboardObjective packet = new ScoreboardObjective();
        packet.safeDecode(buffer);
        return packet;
    }

}
