package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock160.Packet
{

    public static final int ID = 56;

    public soupply.bedrock160.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
    }

    public BlockEntityData(soupply.bedrock160.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
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
    public void decodeBody(Buffer buffer)
    {
    }

}
