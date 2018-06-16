package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class ServerSettingsRequest extends soupply.bedrock150.Packet
{

    public static final int ID = 102;

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
