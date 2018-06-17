package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePackChunkRequest extends soupply.bedrock141.Packet
{

    public static final int ID = 84;

    public String id;
    public int chunkIndex;

    public ResourcePackChunkRequest()
    {
    }

    public ResourcePackChunkRequest(String id, int chunkIndex)
    {
        this.id = id;
        this.chunkIndex = chunkIndex;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] aq = _buffer.convertString(id);
        _buffer.writeVaruint((int)aq.length);
        _buffer.writeBytes(aq);
        _buffer.writeLittleEndianInt(chunkIndex);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        chunkIndex = _buffer.readLittleEndianInt();
    }

    public static ResourcePackChunkRequest fromBuffer(byte[] buffer)
    {
        ResourcePackChunkRequest packet = new ResourcePackChunkRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
