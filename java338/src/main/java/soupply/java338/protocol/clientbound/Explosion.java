package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Explosion extends soupply.java338.Packet
{

    public static final int ID = 28;

    public Tuples.FloatXYZ position;
    public float radius;
    public Tuples.ByteXYZ[] records;
    public Tuples.FloatXYZ motion;

    public Explosion()
    {
    }

    public Explosion(Tuples.FloatXYZ position, float radius, Tuples.ByteXYZ[] records, Tuples.FloatXYZ motion)
    {
        this.position = position;
        this.radius = radius;
        this.records = records;
        this.motion = motion;
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
