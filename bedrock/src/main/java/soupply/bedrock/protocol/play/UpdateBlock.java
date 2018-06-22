package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateBlock extends soupply.bedrock.Packet
{

    public static final int ID = 21;

    // flags and meta
    public static final int NEIGHBORS = (int)1;
    public static final int NETWORK = (int)2;
    public static final int NO_GRAPHIC = (int)4;
    public static final int PRIORITY = (int)8;

    // data layer id
    public static final int NORMAL = (int)0;
    public static final int LIQUID = (int)1;

    public soupply.bedrock.type.BlockPosition position;
    public int block;
    public int flagsAndMeta;
    public int dataLayerId;

    public UpdateBlock()
    {
        this.position = new soupply.bedrock.type.BlockPosition();
    }

    public UpdateBlock(soupply.bedrock.type.BlockPosition position, int block, int flagsAndMeta, int dataLayerId)
    {
        this.position = position;
        this.block = block;
        this.flagsAndMeta = flagsAndMeta;
        this.dataLayerId = dataLayerId;
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
        _buffer.writeVaruint(dataLayerId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.decodeBody(_buffer);
        block = _buffer.readVaruint();
        flagsAndMeta = _buffer.readVaruint();
        dataLayerId = _buffer.readVaruint();
    }

    public static UpdateBlock fromBuffer(byte[] buffer)
    {
        UpdateBlock packet = new UpdateBlock();
        packet.safeDecode(buffer);
        return packet;
    }

}
