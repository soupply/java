package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class PlaySound extends soupply.bedrock150.Packet
{

    public static final int ID = 86;

    public String name;
    public soupply.bedrock150.type.BlockPosition position;
    public float volume;
    public float pitch;

    public PlaySound()
    {
    }

    public PlaySound(String name, soupply.bedrock150.type.BlockPosition position, float volume, float pitch)
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
