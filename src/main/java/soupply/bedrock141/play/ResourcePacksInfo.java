package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock141.Packet
{

    public boolean mustAccept;
    public soupply.bedrock141.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock141.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock141.type.PackWithSize[] behaviourPacks, soupply.bedrock141.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
