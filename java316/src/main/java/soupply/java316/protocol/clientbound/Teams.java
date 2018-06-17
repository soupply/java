package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Teams extends soupply.java316.Packet
{

    public static final int ID = 65;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
