package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class Explode extends soupply.bedrock150.Packet
{

    public static final int ID = 23;

    public FloatXYZ position;
    public float radius;
    public soupply.bedrock150.type.BlockPosition[] destroyedBlocks;

    public Explode()
    {
        this.position = new FloatXYZ();
        this.destroyedBlocks = new soupply.bedrock150.type.BlockPosition[]();
    }

    public Explode(FloatXYZ position, float radius, soupply.bedrock150.type.BlockPosition[] destroyedBlocks)
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