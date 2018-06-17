package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class ChunkRadiusUpdated extends soupply.bedrock201.Packet
{

    public static final int ID = 70;

    public int radius;

    public ChunkRadiusUpdated()
    {
    }

    public ChunkRadiusUpdated(int radius)
    {
        this.radius = radius;
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
