package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock160.Packet
{

    public static final int ID = 1;

    public int protocol = 160;
    public soupply.bedrock160.type.LoginBody body;

    public Login()
    {
    }

    public Login(int protocol, soupply.bedrock160.type.LoginBody body)
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
