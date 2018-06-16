package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class ChunkData extends Type
{

    public soupply.bedrock.type.Section[] sections;
    public short[] heights;
    public byte[] biomes;
    public byte[] borders;
    public soupply.bedrock.type.ExtraData[] extraData;
    public byte[] blockEntities;

    public ChunkData()
    {
        this.heights = new short[256];
        this.biomes = new byte[256];
    }

    public ChunkData(soupply.bedrock.type.Section[] sections, short[] heights, byte[] biomes, byte[] borders, soupply.bedrock.type.ExtraData[] extraData, byte[] blockEntities)
    {
        this.sections = sections;
        this.heights = heights;
        this.biomes = biomes;
        this.borders = borders;
        this.extraData = extraData;
        this.blockEntities = blockEntities;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
