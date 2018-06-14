package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksStackPacket extends soupply.bedrock137.Packet
{

    public boolean mustAccept;
    public soupply.bedrock137.type.Pack[] behaviourPacks;
    public soupply.bedrock137.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock137.type.Pack[] behaviourPacks, soupply.bedrock137.type.Pack[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
