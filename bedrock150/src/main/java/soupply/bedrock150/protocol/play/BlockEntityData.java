package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock150.Packet
{

    public static final int ID = 56;

    public soupply.bedrock150.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
        this.position = new soupply.bedrock150.type.BlockPosition();
    }

    public BlockEntityData(soupply.bedrock150.type.BlockPosition position, byte[] nbt)
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
