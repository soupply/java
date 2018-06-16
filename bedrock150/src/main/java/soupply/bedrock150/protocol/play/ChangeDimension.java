package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ChangeDimension extends soupply.bedrock150.Packet
{

    public static final int ID = 61;

    // dimension
    public static final int OVERWORLD = 0;
    public static final int NETHER = 1;
    public static final int END = 2;

    public int dimension;
    public FloatXYZ position;
    public boolean unknown2;

    public ChangeDimension()
    {
        this.position = new FloatXYZ();
    }

    public ChangeDimension(int dimension, FloatXYZ position, boolean unknown2)
    {
        this.dimension = dimension;
        this.position = position;
        this.unknown2 = unknown2;
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
