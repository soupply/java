package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class StopSound extends soupply.bedrock141.Packet
{

    public static final int ID = 87;

    public String name;
    public boolean stopAll;

    public StopSound()
    {
    }

    public StopSound(String name, boolean stopAll)
    {
        this.name = name;
        this.stopAll = stopAll;
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
