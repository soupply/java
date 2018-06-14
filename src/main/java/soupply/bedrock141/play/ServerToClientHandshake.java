package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class ServerToClientHandshake extends soupply.bedrock141.Packet
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
