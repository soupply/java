package soupply.java316.login;

import java.util.*;
import soupply.util.*;

class EncryptionRequest extends soupply.java316.Packet
{

    public String serverId;
    public byte[] publicKey;
    public byte[] verifyToken;

    public EncryptionRequest()
    {
    }

    public EncryptionRequest(String serverId, byte[] publicKey, byte[] verifyToken)
    {
        this.serverId = serverId;
        this.publicKey = publicKey;
        this.verifyToken = verifyToken;
    }

}
