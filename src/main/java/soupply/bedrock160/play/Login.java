package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock160.Packet
{

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

}
