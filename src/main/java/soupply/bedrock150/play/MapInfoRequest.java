package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class MapInfoRequest extends soupply.bedrock150.Packet
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
