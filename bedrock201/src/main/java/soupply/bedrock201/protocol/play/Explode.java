package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class Explode extends soupply.bedrock201.Packet
{

    public static final int ID = 23;

    public FloatXYZ position;
    public float radius;
    public soupply.bedrock201.type.BlockPosition[] destroyedBlocks;

    public Explode()
    {
        this.position = new FloatXYZ();
        this.destroyedBlocks = new soupply.bedrock201.type.BlockPosition[]();
    }

    public Explode(FloatXYZ position, float radius, soupply.bedrock201.type.BlockPosition[] destroyedBlocks)
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
