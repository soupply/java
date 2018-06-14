package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class ChunkData extends soupply.java335.Packet
{

    public Tuples.IntXZ position;
    public boolean full;
    public int sections;
    public byte[] data;
    public int tilesCount;
    public byte[] tiles;

    public ChunkData()
    {
    }

    public ChunkData(Tuples.IntXZ position, boolean full, int sections, byte[] data, int tilesCount, byte[] tiles)
    {
        this.position = position;
        this.full = full;
        this.sections = sections;
        this.data = data;
        this.tilesCount = tilesCount;
        this.tiles = tiles;
    }

}
