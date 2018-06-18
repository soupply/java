package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class UseEntity extends soupply.java315.Packet
{

    public static final int ID = 10;

    // type
    public static final int INTERACT = (int)0;
    public static final int ATTACK = (int)1;
    public static final int INTERACT_AT = (int)2;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public int target;
    public int type;
    public FloatXYZ targetPosition;
    public int hand;

    public UseEntity()
    {
        this.targetPosition = new FloatXYZ();
    }

    public UseEntity(int target, int type, FloatXYZ targetPosition, int hand)
    {
        this.target = target;
        this.type = type;
        this.targetPosition = targetPosition;
        this.hand = hand;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(target);
        _buffer.writeVaruint(type);
        if(type==2)
        {
            _buffer.writeBigEndianFloat(targetPosition.x);
            _buffer.writeBigEndianFloat(targetPosition.y);
            _buffer.writeBigEndianFloat(targetPosition.z);
        }
        if(type==0||type==2)
        {
            _buffer.writeVaruint(hand);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        target = _buffer.readVaruint();
        type = _buffer.readVaruint();
        if(type==2)
        {
            targetPosition.x = _buffer.readBigEndianFloat();
            targetPosition.y = _buffer.readBigEndianFloat();
            targetPosition.z = _buffer.readBigEndianFloat();
        }
        if(type==0||type==2)
        {
            hand = _buffer.readVaruint();
        }
    }

    public static UseEntity fromBuffer(byte[] buffer)
    {
        UseEntity packet = new UseEntity();
        packet.safeDecode(buffer);
        return packet;
    }

}
