package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateEquip extends soupply.bedrock160.Packet
{

    public static final int ID = 81;

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
