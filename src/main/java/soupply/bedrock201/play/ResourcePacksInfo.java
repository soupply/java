package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock201.Packet
{

    public boolean mustAccept;
    public soupply.bedrock201.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock201.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock201.type.PackWithSize[] behaviourPacks, soupply.bedrock201.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
