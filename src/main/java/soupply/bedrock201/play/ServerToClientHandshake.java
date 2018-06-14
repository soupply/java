package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ServerToClientHandshake extends soupply.bedrock201.Packet
{

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

}
