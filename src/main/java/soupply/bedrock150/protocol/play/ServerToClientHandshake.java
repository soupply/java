package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class ServerToClientHandshake extends soupply.bedrock150.Packet
{

    public static final int ID = 3;

    public String serverPublicKey;
    public byte[] token;

    public ServerToClientHandshake()
    {
    }

    public ServerToClientHandshake(String serverPublicKey, byte[] token)
    {
        this.serverPublicKey = serverPublicKey;
        this.token = token;
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
