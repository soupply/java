package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ChunkData extends soupply.java316.Packet
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
