package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class PlaySound extends soupply.bedrock160.Packet
{

    public String name;
    public soupply.bedrock160.type.BlockPosition position;
    public float volume;
    public float pitch;

    public PlaySound()
    {
    }

    public PlaySound(String name, soupply.bedrock160.type.BlockPosition position, float volume, float pitch)
    {
        this.name = name;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
    }

}
