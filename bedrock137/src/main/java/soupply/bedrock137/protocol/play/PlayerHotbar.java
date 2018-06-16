package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class PlayerHotbar extends soupply.bedrock137.Packet
{

    public static final int ID = 48;

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
