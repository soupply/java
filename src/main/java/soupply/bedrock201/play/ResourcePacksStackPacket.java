package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksStackPacket extends soupply.bedrock201.Packet
{

    public boolean mustAccept;
    public soupply.bedrock201.type.Pack[] behaviourPacks;
    public soupply.bedrock201.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock201.type.Pack[] behaviourPacks, soupply.bedrock201.type.Pack[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
