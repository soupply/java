package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock.Packet
{

    public static final int ID = 6;

    public boolean mustAccept;
    public soupply.bedrock.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock.type.PackWithSize[] behaviourPacks, soupply.bedrock.type.PackWithSize[] resourcePacks)
    {
        this.mustAccept = mustAccept;
        this.behaviourPacks = behaviourPacks;
        this.resourcePacks = resourcePacks;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
