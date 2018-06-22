package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateBlockSynced extends soupply.bedrock.Packet
{

    public static final int ID = 110;

    // flags and meta
    public static final int NEIGHBORS = (int)1;
    public static final int NETWORK = (int)2;
    public static final int NO_GRAPHIC = (int)4;
    public static final int PRIORITY = (int)8;

    public soupply.bedrock.type.BlockPosition position;
    public int block;
    public int flagsAndMeta;
    public long entityId;
    public long unknown4;

    public UpdateBlockSynced()
    {
        this.position = new soupply.bedrock.type.BlockPosition();
    }

    public UpdateBlockSynced(soupply.bedrock.type.BlockPosition position, int block, int flagsAndMeta, long entityId, long unknown4)
    {
        this.position = position;
        this.block = block;
        this.flagsAndMeta = flagsAndMeta;
        this.entityId = entityId;
        this.unknown4 = unknown4;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        position.encodeBody(_buffer);
        _buffer.writeVaruint(block);
        _buffer.writeVaruint(flagsAndMeta);
        _buffer.writeVarlong(entityId);
        _buffer.writeVarulong(unknown4);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.decodeBody(_buffer);
        block = _buffer.readVaruint();
        flagsAndMeta = _buffer.readVaruint();
        entityId = _buffer.readVarlong();
        unknown4 = _buffer.readVarulong();
    }

    public static UpdateBlockSynced fromBuffer(byte[] buffer)
    {
        UpdateBlockSynced packet = new UpdateBlockSynced();
        packet.safeDecode(buffer);
        return packet;
    }

}
