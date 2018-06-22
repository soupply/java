package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class Explode extends soupply.bedrock150.Packet
{

    public static final int ID = 23;

    public FloatXYZ position;
    public float radius;
    public soupply.bedrock150.type.BlockPosition[] destroyedBlocks;

    public Explode()
    {
        this.position = new FloatXYZ();
    }

    public Explode(FloatXYZ position, float radius, soupply.bedrock150.type.BlockPosition[] destroyedBlocks)
    {
        this.position = position;
        this.radius = radius;
        this.destroyedBlocks = destroyedBlocks;
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
        _buffer.writeLittleEndianFloat(radius);
        _buffer.writeVaruint((int)destroyedBlocks.length);
        for(soupply.bedrock150.type.BlockPosition zvdjevqx:destroyedBlocks)
        {
            zvdjevqx.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        radius = _buffer.readLittleEndianFloat();
        final int brcrblzj = _buffer.readVaruint();
        destroyedBlocks = new soupply.bedrock150.type.BlockPosition[brcrblzj];
        for(int zvdjevqx=0;zvdjevqx<destroyedBlocks.length;zvdjevqx++)
        {
            destroyedBlocks[zvdjevqx].decodeBody(_buffer);
        }
    }

    public static Explode fromBuffer(byte[] buffer)
    {
        Explode packet = new Explode();
        packet.safeDecode(buffer);
        return packet;
    }

}
