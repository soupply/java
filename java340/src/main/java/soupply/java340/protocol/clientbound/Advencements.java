package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Advencements extends soupply.java340.Packet
{

    public static final int ID = 77;

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
