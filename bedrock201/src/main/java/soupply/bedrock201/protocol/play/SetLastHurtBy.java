package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetLastHurtBy extends soupply.bedrock201.Packet
{

    public static final int ID = 96;

    public int unknown0;

    public SetLastHurtBy()
    {
    }

    public SetLastHurtBy(int unknown0)
    {
        this.unknown0 = unknown0;
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
