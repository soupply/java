package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class MapInfoRequest extends soupply.bedrock141.Packet
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
