package soupply.bedrock282.type;

import java.util.*;
import soupply.util.*;

public class ChunkData extends Type
{

    public soupply.bedrock282.type.Section[] sections;
    public short[] heights;
    public byte[] biomes;
    public byte[] borders;
    public soupply.bedrock282.type.ExtraData[] extraData;
    public byte[] blockEntities;

    public ChunkData()
    {
        this.heights = new short[256];
        this.biomes = new byte[256];
    }

    public ChunkData(soupply.bedrock282.type.Section[] sections, short[] heights, byte[] biomes, byte[] borders, soupply.bedrock282.type.ExtraData[] extraData, byte[] blockEntities)
    {
        this.sections = sections;
        this.heights = heights;
        this.biomes = biomes;
        this.borders = borders;
        this.extraData = extraData;
        this.blockEntities = blockEntities;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        Buffer _nbuffer = new Buffer();
        this.encodeBodyImpl(_nbuffer);
        _buffer.writeVaruint(_nbuffer._buffer.length);
        _buffer.writeBytes(_nbuffer.toByteArray());
    }

    private void encodeBodyImpl(Buffer _buffer)
    {
        _buffer.writeVaruint((int)sections.length);
        for(soupply.bedrock282.type.Section cvdlbm:sections)
        {
            cvdlbm.encodeBody(_buffer);
        }
        for(short avzhc:heights)
        {
            _buffer.writeLittleEndianShort(avzhc);
        }
        _buffer.writeBytes(biomes);
        _buffer.writeVaruint((int)borders.length);
        _buffer.writeBytes(borders);
        _buffer.writeVaruint((int)extraData.length);
        for(soupply.bedrock282.type.ExtraData zhcfyr:extraData)
        {
            zhcfyr.encodeBody(_buffer);
        }
        _buffer.writeBytes(blockEntities);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int _length = _buffer.readVaruint();
        this.decodeBodyImpl(new Buffer(_buffer.readBytes(_length)));
    }

    private void decodeBodyImpl(Buffer _buffer) throws DecodeException
    {
        final int bnyrb5 = _buffer.readVaruint();
        sections = new soupply.bedrock282.type.Section[bnyrb5];
        for(int cvdlbm=0;cvdlbm<sections.length;cvdlbm++)
        {
            sections[cvdlbm].decodeBody(_buffer);
        }
        for(int avzhc=0;avzhc<heights.length;avzhc++)
        {
            heights[avzhc] = _buffer.readLittleEndianShort();
        }
        biomes = _buffer.readBytes(biomes.length);
        final int bjcrcm = _buffer.readVaruint();
        borders = _buffer.readBytes(bjcrcm);
        final int bvdjrfy = _buffer.readVaruint();
        extraData = new soupply.bedrock282.type.ExtraData[bvdjrfy];
        for(int zhcfyr=0;zhcfyr<extraData.length;zhcfyr++)
        {
            extraData[zhcfyr].decodeBody(_buffer);
        }
        blockEntities = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

}
