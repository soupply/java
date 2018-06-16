package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

class ChunkData extends Type
{

    public soupply.bedrock137.type.Section[] sections;
    public short[] heights;
    public byte[] biomes;
    public byte[] borders;
    public soupply.bedrock137.type.ExtraData[] extraData;
    public byte[] blockEntities;

    public ChunkData()
    {
    }

    public ChunkData(soupply.bedrock137.type.Section[] sections, short[] heights, byte[] biomes, byte[] borders, soupply.bedrock137.type.ExtraData[] extraData, byte[] blockEntities)
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
