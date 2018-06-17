package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class Transfer extends soupply.bedrock137.Packet
{

    public static final int ID = 85;

    public String ip;
    public short port = 19132;

    public Transfer()
    {
    }

    public Transfer(String ip, short port)
    {
        this.ip = ip;
        this.port = port;
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
