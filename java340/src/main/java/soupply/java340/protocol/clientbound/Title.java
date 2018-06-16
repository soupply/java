package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Title extends soupply.java340.Packet
{

    public static final int ID = 72;

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
