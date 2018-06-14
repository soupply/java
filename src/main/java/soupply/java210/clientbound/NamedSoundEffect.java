package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class NamedSoundEffect extends soupply.java210.Packet
{

    public String name;
    public int category;
    public Tuples.IntXYZ position;
    public float volume;
    public float pitch;

    public NamedSoundEffect()
    {
    }

    public NamedSoundEffect(String name, int category, Tuples.IntXYZ position, float volume, float pitch)
    {
        this.name = name;
        this.category = category;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
    }

}
