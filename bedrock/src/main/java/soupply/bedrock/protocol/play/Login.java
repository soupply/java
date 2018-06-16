package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock.Packet
{

    public static final int ID = 1;

    public int protocol = 201;
    public soupply.bedrock.type.LoginBody body;

    public Login()
    {
        this.body = new soupply.bedrock.type.LoginBody();
    }

    public Login(int protocol, soupply.bedrock.type.LoginBody body)
    {
        this.protocol = protocol;
        this.body = body;
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
