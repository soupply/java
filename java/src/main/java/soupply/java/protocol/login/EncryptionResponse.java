package soupply.java.protocol.login;

import java.util.*;
import soupply.util.*;

public class EncryptionResponse extends soupply.java.Packet
{

    public static final int ID = 1;

    public byte[] sharedSecret;
    public byte[] verifyToken;

    public EncryptionResponse()
    {
    }

    public EncryptionResponse(byte[] sharedSecret, byte[] verifyToken)
    {
        this.sharedSecret = sharedSecret;
        this.verifyToken = verifyToken;
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
