package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePackChunkData extends soupply.bedrock.Packet
{

    public static final int ID = 83;

    public String id;
    public int chunkIndex;
    public long progress;
    public byte[] data;

    public ResourcePackChunkData()
    {
    }

    public ResourcePackChunkData(String id, int chunkIndex, long progress, byte[] data)
    {
        this.id = id;
        this.chunkIndex = chunkIndex;
        this.progress = progress;
        this.data = data;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] arz = _buffer.convertString(id);
        _buffer.writeVaruint((int)arz.length);
        _buffer.writeBytes(arz);
        _buffer.writeLittleEndianInt(chunkIndex);
        _buffer.writeLittleEndianLong(progress);
        _buffer.writeLittleEndianInt((int)data.length);
        _buffer.writeBytes(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        chunkIndex = _buffer.readLittleEndianInt();
        progress = _buffer.readLittleEndianLong();
        final int brde = _buffer.readLittleEndianInt();
        data = _buffer.readBytes(brde);
    }

    public static ResourcePackChunkData fromBuffer(byte[] buffer)
    {
        ResourcePackChunkData packet = new ResourcePackChunkData();
        packet.safeDecode(buffer);
        return packet;
    }

}
