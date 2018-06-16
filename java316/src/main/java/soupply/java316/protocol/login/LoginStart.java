package soupply.java316.protocol.login;

import java.util.*;
import soupply.util.*;

class LoginStart extends soupply.java316.Packet
{

    public static final int ID = 0;

    public String username;

    public LoginStart()
    {
    }

    public LoginStart(String username)
    {
        this.username = username;
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
