package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock201.Packet
{

    public static final int ID = 56;

    public soupply.bedrock201.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
        this.position = new soupply.bedrock201.type.BlockPosition();
    }

    public BlockEntityData(soupply.bedrock201.type.BlockPosition position, byte[] nbt)
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
