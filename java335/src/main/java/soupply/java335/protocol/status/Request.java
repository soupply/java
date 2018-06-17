package soupply.java335.protocol.status;

import java.util.*;
import soupply.util.*;

public class Request extends soupply.java335.Packet
{

    public static final int ID = 0;

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
