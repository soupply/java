package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class InitiateWebSocketConnection extends soupply.bedrock.Packet
{

    public static final int ID = 95;

    public String unknown0;

    public InitiateWebSocketConnection()
    {
    }

    public InitiateWebSocketConnection(String unknown0)
    {
        this.unknown0 = unknown0;
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
