package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SetExperience extends soupply.java340.Packet
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
