package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock150.Packet
{

    public int protocol = 150;
    public soupply.bedrock150.type.LoginBody body;

    public Login()
    {
    }

    public Login(int protocol, soupply.bedrock150.type.LoginBody body)
    {
        this.protocol = protocol;
        this.body = body;
    }

}
