package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class Explode extends soupply.bedrock.Packet
{

    public static final int ID = 23;

    public FloatXYZ position;
    public float radius;
    public soupply.bedrock.type.BlockPosition[] destroyedBlocks;

    public Explode()
    {
        this.position = new FloatXYZ();
    }

    public Explode(FloatXYZ position, float radius, soupply.bedrock.type.BlockPosition[] destroyedBlocks)
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
        for(soupply.bedrock.type.BlockPosition zvdjevqx:destroyedBlocks)
        {
            zvdjevqx.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readLittleEndianFloat();
        position.y = _buffer.readLittleEndianFloat();
        position.z = _buffer.readLittleEndianFloat();
        radius = _buffer.readLittleEndianFloat();
        final int brcrblzj = _buffer.readVaruint();
        destroyedBlocks = new soupply.bedrock.type.BlockPosition[brcrblzj];
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
