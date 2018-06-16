package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Explosion extends soupply.java340.Packet
{

    public static final int ID = 28;

    public FloatXYZ position;
    public float radius;
    public ByteXYZ[] records;
    public FloatXYZ motion;

    public Explosion()
    {
        this.position = new FloatXYZ();
        this.records = new ByteXYZ[]();
        this.motion = new FloatXYZ();
    }

    public Explosion(FloatXYZ position, float radius, ByteXYZ[] records, FloatXYZ motion)
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
