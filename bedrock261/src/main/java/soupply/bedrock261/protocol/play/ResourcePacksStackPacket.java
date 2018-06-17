package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePacksStackPacket extends soupply.bedrock261.Packet
{

    public static final int ID = 7;

    public boolean mustAccept;
    public soupply.bedrock261.type.Pack[] behaviourPacks;
    public soupply.bedrock261.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock261.type.Pack[] behaviourPacks, soupply.bedrock261.type.Pack[] resourcePacks)
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
