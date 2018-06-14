package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ServerToClientHandshake extends soupply.bedrock150.Packet
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
