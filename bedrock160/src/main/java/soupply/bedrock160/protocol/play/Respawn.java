package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class Respawn extends soupply.bedrock160.Packet
{

    public static final int ID = 45;

    public FloatXYZ position;

    public Respawn()
    {
        this.position = new FloatXYZ();
    }

    public Respawn(FloatXYZ position)
    {
        this.position = position;
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
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
    }

    public static Respawn fromBuffer(byte[] buffer)
    {
        Respawn packet = new Respawn();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
