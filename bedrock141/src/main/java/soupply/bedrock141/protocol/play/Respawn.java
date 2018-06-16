package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class Respawn extends soupply.bedrock141.Packet
{

    public static final int ID = 45;

    public Tuples.FloatXYZ position;

    public Respawn()
    {
        this.position = new Tuples.FloatXYZ();
    }

    public Respawn(Tuples.FloatXYZ position)
    {
        this.position = position;
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
