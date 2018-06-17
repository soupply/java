package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetCommandsEnabled extends soupply.bedrock.Packet
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
