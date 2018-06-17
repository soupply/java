package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class RequestChunkRadius extends soupply.bedrock137.Packet
{

    public static final int ID = 69;

    public int radius;

    public RequestChunkRadius()
    {
    }

    public RequestChunkRadius(int radius)
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
