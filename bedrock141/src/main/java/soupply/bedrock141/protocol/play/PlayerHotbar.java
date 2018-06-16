package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerHotbar extends soupply.bedrock141.Packet
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
