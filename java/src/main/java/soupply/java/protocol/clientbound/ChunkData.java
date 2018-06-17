package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ChunkData extends soupply.java.Packet
{

    public static final int ID = 32;

    public IntXZ position;
    public boolean full;
    public int sections;
    public byte[] data;
    public int tilesCount;
    public byte[] tiles;

    public ChunkData()
    {
        this.position = new IntXZ();
    }

    public ChunkData(IntXZ position, boolean full, int sections, byte[] data, int tilesCount, byte[] tiles)
    {
        this.position = position;
        this.full = full;
        this.sections = sections;
        this.data = data;
        this.tilesCount = tilesCount;
        this.tiles = tiles;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(position.x);
        _buffer.writeBigEndianInt(position.z);
        _buffer.writeBool(full);
        _buffer.writeVaruint(sections);
        _buffer.writeVaruint((int)data.length);
        _buffer.writeBytes(data);
        _buffer.writeVaruint(tilesCount);
        _buffer.writeBytes(tiles);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readBigEndianInt();
        position.z = _buffer.readBigEndianInt();
        full = _buffer.readBool();
        sections = _buffer.readVaruint();
        final int brde = _buffer.readVaruint();
        data = _buffer.readBytes(brde);
        tilesCount = _buffer.readVaruint();
        tiles = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static ChunkData fromBuffer(byte[] buffer)
    {
        ChunkData packet = new ChunkData();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
