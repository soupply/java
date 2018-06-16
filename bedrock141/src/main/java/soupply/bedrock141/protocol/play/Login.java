package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class Login extends soupply.bedrock141.Packet
{

    public static final int ID = 1;

    public int protocol = 141;
    public soupply.bedrock141.type.LoginBody body;

    public Login()
    {
        this.body = new soupply.bedrock141.type.LoginBody();
    }

    public Login(int protocol, soupply.bedrock141.type.LoginBody body)
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
