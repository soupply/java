package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksStackPacket extends soupply.bedrock141.Packet
{

    public boolean mustAccept;
    public soupply.bedrock141.type.Pack[] behaviourPacks;
    public soupply.bedrock141.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock141.type.Pack[] behaviourPacks, soupply.bedrock141.type.Pack[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
