package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class SoundEffect extends soupply.java316.Packet
{

    public int soundId;
    public int category;
    public Tuples.IntXYZ position;
    public float volume;
    public float pitch;

    public SoundEffect()
    {
    }

    public SoundEffect(int soundId, int category, Tuples.IntXYZ position, float volume, float pitch)
    {
        this.soundId = soundId;
        this.category = category;
        this.position = position;
        this.volume = volume;
        this.pitch = pitch;
    }

}
