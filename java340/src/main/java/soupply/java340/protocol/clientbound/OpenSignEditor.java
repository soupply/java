package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class OpenSignEditor extends soupply.java340.Packet
{

    public static final int ID = 42;

    public long position;

    public OpenSignEditor()
    {
    }

    public OpenSignEditor(long position)
    {
        this.position = position;
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
