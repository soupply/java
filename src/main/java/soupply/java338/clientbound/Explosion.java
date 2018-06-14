package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class Explosion extends soupply.java338.Packet
{

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

}
