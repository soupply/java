package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetTime extends soupply.bedrock141.Packet
{

    public static final int ID = 10;

    public int time;

    public SetTime()
    {
    }

    public SetTime(int time)
    {
        this.time = time;
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
