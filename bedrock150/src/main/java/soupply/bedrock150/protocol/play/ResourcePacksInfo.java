package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePacksInfo extends soupply.bedrock150.Packet
{

    public static final int ID = 6;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
