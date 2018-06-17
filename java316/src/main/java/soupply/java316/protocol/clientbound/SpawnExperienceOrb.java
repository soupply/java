package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnExperienceOrb extends soupply.java316.Packet
{

    public static final int ID = 1;

    public int entityId;
    public DoubleXYZ position;
    public short count;

    public SpawnExperienceOrb()
    {
        this.position = new DoubleXYZ();
    }

    public SpawnExperienceOrb(int entityId, DoubleXYZ position, short count)
    {
        this.entityId = entityId;
        this.position = position;
        this.count = count;
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
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeBigEndianShort(count);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        count = _buffer.readBigEndianShort();
    }

    public static SpawnExperienceOrb fromBuffer(byte[] buffer)
    {
        SpawnExperienceOrb packet = new SpawnExperienceOrb();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
