package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Teams extends soupply.java340.Packet
{

    public static final int ID = 68;

    public String name;
    public byte mode;

    public Teams()
    {
    }

    public Teams(String name, byte mode)
    {
        this.name = name;
        this.mode = mode;
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
