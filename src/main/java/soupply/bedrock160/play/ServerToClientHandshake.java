package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ServerToClientHandshake extends soupply.bedrock160.Packet
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
