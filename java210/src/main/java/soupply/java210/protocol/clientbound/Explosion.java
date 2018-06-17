package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Explosion extends soupply.java210.Packet
{

    public static final int ID = 28;

    public FloatXYZ position;
    public float radius;
    public ByteXYZ[] records;
    public FloatXYZ motion;

    public Explosion()
    {
        this.position = new FloatXYZ();
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
