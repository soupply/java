package soupply.java340.login;

import java.util.*;
import soupply.util.*;

class LoginSuccess extends soupply.java340.Packet
{

    public String uuid;
    public String username;

    public LoginSuccess()
    {
    }

    public LoginSuccess(String uuid, String username)
    {
        this.uuid = uuid;
        this.username = username;
    }

}
