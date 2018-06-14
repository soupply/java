package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class Login extends soupply.bedrock141.Packet
{

    public int protocol = 141;
    public soupply.bedrock141.type.LoginBody body;

    public Login()
    {
    }

    public Login(int protocol, soupply.bedrock141.type.LoginBody body)
    {
        this.protocol = protocol;
        this.body = body;
    }

}
