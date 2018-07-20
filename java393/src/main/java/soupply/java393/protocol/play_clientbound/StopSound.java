package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class StopSound extends soupply.java393.Packet
{

    public static final int ID = 76;

    // source
    public static final int MASTER = (int)0;
    public static final int MUSIC = (int)1;
    public static final int RECORD = (int)2;
    public static final int WEATHER = (int)3;
    public static final int BLOCK = (int)4;
    public static final int HOSTILE = (int)5;
    public static final int NEUTRAL = (int)6;
    public static final int PLAYER = (int)7;
    public static final int AMBIENT = (int)8;
    public static final int VOICE = (int)9;

    public byte flags;
    public int source;
    public String sound;

    public StopSound()
    {
    }

    public StopSound(byte flags, int source, String sound)
    {
        this.flags = flags;
        this.source = source;
        this.sound = sound;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(flags);
        if(flags&1)
        {
            _buffer.writeVaruint(source);
        }
        if(flags&2)
        {
            byte[] c9bq = _buffer.convertString(sound);
            _buffer.writeVaruint((int)c9bq.length);
            _buffer.writeBytes(c9bq);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        flags = _buffer.readByte();
        if(flags&1)
        {
            source = _buffer.readVaruint();
        }
        if(flags&2)
        {
            final int bvc9bq = _buffer.readVaruint();
            sound = _buffer.readString(bvc9bq);
        }
    }

    public static StopSound fromBuffer(byte[] buffer)
    {
        StopSound packet = new StopSound();
        packet.safeDecode(buffer);
        return packet;
    }

}
