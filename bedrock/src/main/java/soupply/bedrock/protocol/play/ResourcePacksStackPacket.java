package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePacksStackPacket extends soupply.bedrock.Packet
{

    public static final int ID = 7;

    public boolean mustAccept;
    public soupply.bedrock.type.Pack[] behaviourPacks;
    public soupply.bedrock.type.Pack[] resourcePacks;

    public ResourcePacksStackPacket()
    {
    }

    public ResourcePacksStackPacket(boolean mustAccept, soupply.bedrock.type.Pack[] behaviourPacks, soupply.bedrock.type.Pack[] resourcePacks)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(mustAccept);
        _buffer.writeVaruint((int)behaviourPacks.length);
        for(soupply.bedrock.type.Pack yvyzbvuf:behaviourPacks)
        {
            yvyzbvuf.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)resourcePacks.length);
        for(soupply.bedrock.type.Pack cvbvyvyn:resourcePacks)
        {
            cvbvyvyn.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        mustAccept = _buffer.readBool();
        final int bjafa9cb = _buffer.readVaruint();
        behaviourPacks = new soupply.bedrock.type.Pack[bjafa9cb];
        for(int yvyzbvuf=0;yvyzbvuf<behaviourPacks.length;yvyzbvuf++)
        {
            behaviourPacks[yvyzbvuf].decodeBody(_buffer);
        }
        final int bjc9cnuf = _buffer.readVaruint();
        resourcePacks = new soupply.bedrock.type.Pack[bjc9cnuf];
        for(int cvbvyvyn=0;cvbvyvyn<resourcePacks.length;cvbvyvyn++)
        {
            resourcePacks[cvbvyvyn].decodeBody(_buffer);
        }
    }

    public static ResourcePacksStackPacket fromBuffer(byte[] buffer)
    {
        ResourcePacksStackPacket packet = new ResourcePacksStackPacket();
        packet.safeDecode(buffer);
        return packet;
    }

}
