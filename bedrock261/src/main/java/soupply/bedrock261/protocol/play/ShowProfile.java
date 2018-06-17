package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ShowProfile extends soupply.bedrock261.Packet
{

    public static final int ID = 104;

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
