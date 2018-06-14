package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class PlaySound extends soupply.bedrock137.Packet
{

    public String name;
    public soupply.bedrock137.type.BlockPosition position;
    public float volume;
    public float pitch;

    public PlaySound()
    {
    }

    public PlaySound(String name, soupply.bedrock137.type.BlockPosition position, float volume, float pitch)
    {
        this.name = name;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
    }

}
