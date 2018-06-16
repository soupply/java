package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class Explode extends soupply.bedrock.Packet
{

    public static final int ID = 23;

    public Tuples.FloatXYZ position;
    public float radius;
    public soupply.bedrock.type.BlockPosition[] destroyedBlocks;

    public Explode()
    {
        this.position = new Tuples.FloatXYZ();
        this.destroyedBlocks = new soupply.bedrock.type.BlockPosition[]();
    }

    public Explode(Tuples.FloatXYZ position, float radius, soupply.bedrock.type.BlockPosition[] destroyedBlocks)
    {
        this.position = position;
        this.radius = radius;
        this.destroyedBlocks = destroyedBlocks;
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
