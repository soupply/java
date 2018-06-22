package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SpawnExperienceOrb extends soupply.bedrock.Packet
{

    public static final int ID = 66;

    public FloatXYZ position;
    public int count;

    public SpawnExperienceOrb()
    {
        this.position = new FloatXYZ();
    }

    public SpawnExperienceOrb(FloatXYZ position, int count)
    {
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
        _buffer.writeLittleEndianFloat(position.x);
        _buffer.writeLittleEndianFloat(position.y);
        _buffer.writeLittleEndianFloat(position.z);
        _buffer.writeVarint(count);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        count = _buffer.readVarint();
    }

    public static SpawnExperienceOrb fromBuffer(byte[] buffer)
    {
        SpawnExperienceOrb packet = new SpawnExperienceOrb();
        packet.safeDecode(buffer);
        return packet;
    }

}
