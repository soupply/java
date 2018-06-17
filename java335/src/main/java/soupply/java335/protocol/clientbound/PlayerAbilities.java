package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerAbilities extends soupply.java335.Packet
{

    public static final int ID = 43;

    // flags
    public static final byte INVULNERABLE = (byte)1;
    public static final byte FLYING = (byte)2;
    public static final byte ALLOW_FLYING = (byte)4;
    public static final byte CREATIVE_MODE = (byte)8;

    public byte flags;
    public float flyingSpeed;
    public float fovModifier;

    public PlayerAbilities()
    {
    }

    public PlayerAbilities(byte flags, float flyingSpeed, float fovModifier)
    {
        this.flags = flags;
        this.flyingSpeed = flyingSpeed;
        this.fovModifier = fovModifier;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianByte(flags);
        _buffer.writeBigEndianFloat(flyingSpeed);
        _buffer.writeBigEndianFloat(fovModifier);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        flags = _buffer.readBigEndianByte();
        flyingSpeed = _buffer.readBigEndianFloat();
        fovModifier = _buffer.readBigEndianFloat();
    }

    public static PlayerAbilities fromBuffer(byte[] buffer)
    {
        PlayerAbilities packet = new PlayerAbilities();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
