package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class StructureBlockUpdate extends soupply.bedrock261.Packet
{

    public static final int ID = 90;

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
