package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.bedrock150.Packet
{

    public static final int ID = 66;

    public Tuples.FloatXYZ position;
    public int count;

    public SpawnExperienceOrb()
    {
    }

    public SpawnExperienceOrb(Tuples.FloatXYZ position, int count)
    {
        this.position = position;
        this.count = count;
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
