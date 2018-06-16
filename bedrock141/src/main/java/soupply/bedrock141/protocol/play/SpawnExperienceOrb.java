package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.bedrock141.Packet
{

    public static final int ID = 66;

    public FloatXYZ position;
    public int count;

    public SpawnExperienceOrb()
    {
        this.position = new FloatXYZ();
    }

    public SpawnExperienceOrb(FloatXYZ position, int count)
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
