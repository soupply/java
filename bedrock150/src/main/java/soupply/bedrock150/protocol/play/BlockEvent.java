package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class BlockEvent extends soupply.bedrock150.Packet
{

    public static final int ID = 26;

    public soupply.bedrock150.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
        this.position = new soupply.bedrock150.type.BlockPosition();
        this.data = new int[2];
    }

    public BlockEvent(soupply.bedrock150.type.BlockPosition position, int[] data)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
