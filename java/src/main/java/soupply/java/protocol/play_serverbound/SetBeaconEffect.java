package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class SetBeaconEffect extends soupply.java.Packet
{

    public static final int ID = 32;

    public int primaryEffect;
    public int secondaryEffect;

    public SetBeaconEffect()
    {
    }

    public SetBeaconEffect(int primaryEffect, int secondaryEffect)
    {
        this.primaryEffect = primaryEffect;
        this.secondaryEffect = secondaryEffect;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(primaryEffect);
        _buffer.writeVaruint(secondaryEffect);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        primaryEffect = _buffer.readVaruint();
        secondaryEffect = _buffer.readVaruint();
    }

    public static SetBeaconEffect fromBuffer(byte[] buffer)
    {
        SetBeaconEffect packet = new SetBeaconEffect();
        packet.safeDecode(buffer);
        return packet;
    }

}
