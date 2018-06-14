package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock137.Packet
{

    public boolean mustAccept;
    public soupply.bedrock137.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock137.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock137.type.PackWithSize[] behaviourPacks, soupply.bedrock137.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

}
