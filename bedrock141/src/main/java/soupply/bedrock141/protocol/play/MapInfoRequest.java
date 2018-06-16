package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class MapInfoRequest extends soupply.bedrock141.Packet
{

    public static final int ID = 68;

    public long mapId;

    public MapInfoRequest()
    {
    }

    public MapInfoRequest(long mapId)
    {
        this.mapId = mapId;
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
