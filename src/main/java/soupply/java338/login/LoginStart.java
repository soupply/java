package soupply.java338.login;

import java.util.*;
import soupply.util.*;

class LoginStart extends soupply.java338.Packet
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
