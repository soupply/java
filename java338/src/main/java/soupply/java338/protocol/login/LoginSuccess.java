package soupply.java338.protocol.login;

import java.util.*;
import soupply.util.*;

public class LoginSuccess extends soupply.java338.Packet
{

    public static final int ID = 2;

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
