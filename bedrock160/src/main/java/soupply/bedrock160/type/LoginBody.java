package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

public class LoginBody extends Type
{

    public byte[] chain;
    public byte[] clientData;

    public LoginBody()
    {
    }

    public LoginBody(byte[] chain, byte[] clientData)
    {
        this.chain = chain;
        this.clientData = clientData;
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
