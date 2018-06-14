package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ServerToClientHandshake extends soupply.bedrock137.Packet
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
