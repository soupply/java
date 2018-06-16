package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class SimpleEvent extends soupply.bedrock201.Packet
{

    public static final int ID = 64;

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
