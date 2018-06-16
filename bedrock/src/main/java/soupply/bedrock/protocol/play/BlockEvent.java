package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class BlockEvent extends soupply.bedrock.Packet
{

    public static final int ID = 26;

    public soupply.bedrock.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
    }

    public BlockEvent(soupply.bedrock.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
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
