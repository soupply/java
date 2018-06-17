package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateBlock extends soupply.bedrock201.Packet
{

    public static final int ID = 21;

    // flags and meta
    public static final int NEIGHBORS = (int)1;
    public static final int NETWORK = (int)2;
    public static final int NO_GRAPHIC = (int)4;
    public static final int PRIORITY = (int)8;

    public soupply.bedrock201.type.BlockPosition position;
    public int block;
    public int flagsAndMeta;

    public UpdateBlock()
    {
        this.position = new soupply.bedrock201.type.BlockPosition();
    }

    public UpdateBlock(soupply.bedrock201.type.BlockPosition position, int block, int flagsAndMeta)
    {
        this.position = position;
        this.block = block;
        this.flagsAndMeta = flagsAndMeta;
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
