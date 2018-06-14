package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock137.Packet
{

    public int protocol = 137;
    public soupply.bedrock137.type.LoginBody body;

    public Login()
    {
    }

    public Login(int protocol, soupply.bedrock137.type.LoginBody body)
    {
        this.protocol = protocol;
        this.body = body;
    }

}
