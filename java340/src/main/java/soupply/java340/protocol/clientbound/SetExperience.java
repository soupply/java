package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SetExperience extends soupply.java340.Packet
{

    public static final int ID = 64;

    public float experience;
    public int level;
    public int totalExperience;

    public SetExperience()
    {
    }

    public SetExperience(float experience, int level, int totalExperience)
    {
        this.experience = experience;
        this.level = level;
        this.totalExperience = totalExperience;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianFloat(experience);
        _buffer.writeVaruint(level);
        _buffer.writeVaruint(totalExperience);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        experience = _buffer.readBigEndianFloat();
        level = _buffer.readVaruint();
        totalExperience = _buffer.readVaruint();
    }

    public static SetExperience fromBuffer(byte[] buffer)
    {
        SetExperience packet = new SetExperience();
        packet.safeDecode(buffer);
        return packet;
    }

}
