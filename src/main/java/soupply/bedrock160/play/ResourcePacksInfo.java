package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock160.Packet
{

    public boolean mustAccept;
    public soupply.bedrock160.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock160.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock160.type.PackWithSize[] behaviourPacks, soupply.bedrock160.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
