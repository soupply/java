package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class MapInfoRequest extends soupply.bedrock201.Packet
{

    public long mapId;

    public MapInfoRequest()
    {
    }

    public MapInfoRequest(long mapId)
    {
        this.mapId = mapId;
    }

}
