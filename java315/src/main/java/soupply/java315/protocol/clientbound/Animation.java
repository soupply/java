package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Animation extends soupply.java315.Packet
{

    public static final int ID = 6;

    // animation
    public static final byte SWING_MAIN_ARM = (byte)0;
    public static final byte TAKE_DAMAGE = (byte)1;
    public static final byte LEAVE_BED = (byte)2;
    public static final byte SWING_OFFHAND = (byte)3;
    public static final byte CRITICAL_EFFECT = (byte)4;
    public static final byte MAGICAL_CRITICAL_EFFECT = (byte)5;

    public int entityId;
    public byte animation;

    public Animation()
    {
    }

    public Animation(int entityId, byte animation)
    {
        this.entityId = entityId;
        this.animation = animation;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeByte(animation);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        animation = _buffer.readByte();
    }

    public static Animation fromBuffer(byte[] buffer)
    {
        Animation packet = new Animation();
        packet.safeDecode(buffer);
        return packet;
    }

}
