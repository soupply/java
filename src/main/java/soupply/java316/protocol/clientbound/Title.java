package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Title extends soupply.java316.Packet
{

    public static final int ID = 69;

    public int action;

    public Title()
    {
    }

    public Title(int action)
    {
        this.action = action;
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
