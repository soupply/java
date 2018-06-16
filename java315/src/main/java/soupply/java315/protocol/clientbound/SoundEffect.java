package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class SoundEffect extends soupply.java315.Packet
{

    public static final int ID = 70;

    public int soundId;
    public int category;
    public IntXYZ position;
    public float volume;
    public float pitch;

    public SoundEffect()
    {
        this.position = new IntXYZ();
    }

    public SoundEffect(int soundId, int category, IntXYZ position, float volume, float pitch)
    {
        this.soundId = soundId;
        this.category = category;
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
