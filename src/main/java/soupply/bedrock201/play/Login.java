package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock201.Packet
{

    public int protocol = 201;
    public soupply.bedrock201.type.LoginBody body;

    public Login()
    {
    }

    public Login(int protocol, soupply.bedrock201.type.LoginBody body)
    {
        this.protocol = protocol;
        this.body = body;
    }

}
