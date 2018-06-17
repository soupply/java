package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerAbilities extends soupply.java338.Packet
{

    public static final int ID = 19;

    // flags
    public static final byte CREATIVE_MODE = (byte)1;
    public static final byte FLYING = (byte)2;
    public static final byte ALLOW_FLYING = (byte)4;
    public static final byte INVINCIBLE = (byte)8;

    public byte flags;
    public float flyingSpeed;
    public float walkingSpeed;

    public PlayerAbilities()
    {
    }

    public PlayerAbilities(byte flags, float flyingSpeed, float walkingSpeed)
    {
        this.flags = flags;
        this.flyingSpeed = flyingSpeed;
        this.walkingSpeed = walkingSpeed;
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
        _buffer.writeBigEndianFloat(flyingSpeed);
        _buffer.writeBigEndianFloat(walkingSpeed);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        flags = _buffer.readByte();
        flyingSpeed = _buffer.readBigEndianFloat();
        walkingSpeed = _buffer.readBigEndianFloat();
    }

    public static PlayerAbilities fromBuffer(byte[] buffer)
    {
        PlayerAbilities packet = new PlayerAbilities();
        packet.safeDecode(buffer);
        return packet;
    }

}
