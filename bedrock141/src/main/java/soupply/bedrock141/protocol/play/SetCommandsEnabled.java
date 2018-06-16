package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class SetCommandsEnabled extends soupply.bedrock141.Packet
{

    public static final int ID = 59;

    public boolean enabled;

    public SetCommandsEnabled()
    {
    }

    public SetCommandsEnabled(boolean enabled)
    {
        this.enabled = enabled;
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
