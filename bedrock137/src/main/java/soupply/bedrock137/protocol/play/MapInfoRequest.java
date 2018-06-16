package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class MapInfoRequest extends soupply.bedrock137.Packet
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
