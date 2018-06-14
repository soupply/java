package soupply.java210.login;

import java.util.*;
import soupply.util.*;

class LoginStart extends soupply.java210.Packet
{

    public String username;

    public LoginStart()
    {
    }

    public LoginStart(String username)
    {
        this.username = username;
    }

}
