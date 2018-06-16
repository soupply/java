package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.bedrock137.Packet
{

    public static final int ID = 66;

    public Tuples.FloatXYZ position;
    public int count;

    public SpawnExperienceOrb()
    {
        this.position = new Tuples.FloatXYZ();
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
