package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class PlaySound extends soupply.bedrock141.Packet
{

    public static final int ID = 86;

    public String name;
    public soupply.bedrock141.type.BlockPosition position;
    public float volume;
    public float pitch;

    public PlaySound()
    {
        this.position = new soupply.bedrock141.type.BlockPosition();
    }

    public PlaySound(String name, soupply.bedrock141.type.BlockPosition position, float volume, float pitch)
    {
        this.name = name;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
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
