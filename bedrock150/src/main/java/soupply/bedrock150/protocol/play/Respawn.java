package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class Respawn extends soupply.bedrock150.Packet
{

    public static final int ID = 45;

    public FloatXYZ position;

    public Respawn()
    {
        this.position = new FloatXYZ();
    }

    public Respawn(FloatXYZ position)
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