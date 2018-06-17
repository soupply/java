package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class BlockEntityData extends soupply.bedrock261.Packet
{

    public static final int ID = 56;

    public soupply.bedrock261.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
        this.position = new soupply.bedrock261.type.BlockPosition();
    }

    public BlockEntityData(soupply.bedrock261.type.BlockPosition position, byte[] nbt)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
