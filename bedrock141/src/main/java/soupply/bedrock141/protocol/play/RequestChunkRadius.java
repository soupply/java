package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class RequestChunkRadius extends soupply.bedrock141.Packet
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
    public void decodeBody(Buffer buffer)
    {
    }

}
