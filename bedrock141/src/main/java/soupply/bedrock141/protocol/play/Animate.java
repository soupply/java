package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class Animate extends soupply.bedrock141.Packet
{

    public static final int ID = 44;

    // action
    public static final int BREAKING = (int)1;
    public static final int WAKE_UP = (int)3;

    public int action;
    public long entityId;
    public float unknown2;

    public Animate()
    {
    }

    public Animate(int action, long entityId, float unknown2)
    {
        this.action = action;
        this.entityId = entityId;
        this.unknown2 = unknown2;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(action);
        _buffer.writeVarlong(entityId);
        if(action>128)
        {
            _buffer.writeLittleEndianFloat(unknown2);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVarint();
        entityId = _buffer.readVarlong();
        if(action>128)
        {
            unknown2 = _buffer.readLittleEndianFloat();
        }
    }

    public static Animate fromBuffer(byte[] buffer)
    {
        Animate packet = new Animate();
        packet.safeDecode(buffer);
        return packet;
    }

}
