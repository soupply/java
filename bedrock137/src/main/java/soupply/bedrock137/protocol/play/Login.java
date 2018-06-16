package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class Login extends soupply.bedrock137.Packet
{

    public static final int ID = 1;

    public int protocol = 137;
    public soupply.bedrock137.type.LoginBody body;

    public Login()
    {
        this.body = new soupply.bedrock137.type.LoginBody();
    }

    public Login(int protocol, soupply.bedrock137.type.LoginBody body)
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
