package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateBlockSynced extends soupply.bedrock261.Packet
{

    public static final int ID = 110;

    // flags and meta
    public static final int NEIGHBORS = (int)1;
    public static final int NETWORK = (int)2;
    public static final int NO_GRAPHIC = (int)4;
    public static final int PRIORITY = (int)8;

    public soupply.bedrock261.type.BlockPosition position;
    public int block;
    public int flagsAndMeta;
    public long entityId;
    public long unknown4;

    public UpdateBlockSynced()
    {
        this.position = new soupply.bedrock261.type.BlockPosition();
    }

    public UpdateBlockSynced(soupply.bedrock261.type.BlockPosition position, int block, int flagsAndMeta, long entityId, long unknown4)
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
