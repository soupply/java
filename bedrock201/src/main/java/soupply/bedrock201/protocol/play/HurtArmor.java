package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class HurtArmor extends soupply.bedrock201.Packet
{

    public static final int ID = 38;

    public int unknown0;

    public HurtArmor()
    {
    }

    public HurtArmor(int unknown0)
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
