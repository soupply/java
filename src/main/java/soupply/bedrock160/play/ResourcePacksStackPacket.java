package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksStackPacket extends soupply.bedrock160.Packet
{

    public boolean mustAccept;
    public soupply.bedrock160.type.Pack[] behaviourPacks;
    public soupply.bedrock160.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock160.type.Pack[] behaviourPacks, soupply.bedrock160.type.Pack[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
