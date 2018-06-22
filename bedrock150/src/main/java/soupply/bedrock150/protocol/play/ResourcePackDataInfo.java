package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePackDataInfo extends soupply.bedrock150.Packet
{

    public static final int ID = 82;

    public String id;
    public int maxChunkSize;
    public int chunkCount;
    public long compressedPackSize;
    public String sha256;

    public ResourcePackDataInfo()
    {
    }

    public ResourcePackDataInfo(String id, int maxChunkSize, int chunkCount, long compressedPackSize, String sha256)
    {
        this.id = id;
        this.maxChunkSize = maxChunkSize;
        this.chunkCount = chunkCount;
        this.compressedPackSize = compressedPackSize;
        this.sha256 = sha256;
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
        _buffer.writeLittleEndianInt(maxChunkSize);
        _buffer.writeLittleEndianInt(chunkCount);
        _buffer.writeLittleEndianLong(compressedPackSize);
        byte[] chmu = _buffer.convertString(sha256);
        _buffer.writeVaruint((int)chmu.length);
        _buffer.writeBytes(chmu);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        maxChunkSize = _buffer.readLittleEndianInt();
        chunkCount = _buffer.readLittleEndianInt();
        compressedPackSize = _buffer.readLittleEndianLong();
        final int bvchmu = _buffer.readVaruint();
        sha256 = _buffer.readString(bvchmu);
    }

    public static ResourcePackDataInfo fromBuffer(byte[] buffer)
    {
        ResourcePackDataInfo packet = new ResourcePackDataInfo();
        packet.safeDecode(buffer);
        return packet;
    }

}
