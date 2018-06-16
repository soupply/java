package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class ResourcePacksInfo extends soupply.bedrock137.Packet
{

    public static final int ID = 6;

    public boolean mustAccept;
    public soupply.bedrock137.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock137.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
        this.behaviourPacks = new soupply.bedrock137.type.PackWithSize[]();
        this.resourcePacks = new soupply.bedrock137.type.PackWithSize[]();
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock137.type.PackWithSize[] behaviourPacks, soupply.bedrock137.type.PackWithSize[] resourcePacks)
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
