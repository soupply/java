package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class UpdateSign extends soupply.java340.Packet
{

    public static final int ID = 28;

    public long position;
    public String[] lines;

    public UpdateSign()
    {
        this.lines = new String[4];
    }

    public UpdateSign(long position, String[] lines)
    {
        this.position = position;
        this.lines = lines;
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
