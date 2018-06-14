package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock150.Packet
{

    public boolean mustAccept;
    public soupply.bedrock150.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock150.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock150.type.PackWithSize[] behaviourPacks, soupply.bedrock150.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
