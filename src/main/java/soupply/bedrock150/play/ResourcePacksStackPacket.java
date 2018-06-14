package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksStackPacket extends soupply.bedrock150.Packet
{

    public boolean mustAccept;
    public soupply.bedrock150.type.Pack[] behaviourPacks;
    public soupply.bedrock150.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock150.type.Pack[] behaviourPacks, soupply.bedrock150.type.Pack[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
