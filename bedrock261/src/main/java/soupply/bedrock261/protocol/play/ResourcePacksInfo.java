package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePacksInfo extends soupply.bedrock261.Packet
{

    public static final int ID = 6;

    public boolean mustAccept;
    public soupply.bedrock261.type.PackWithSize[] behaviourPacks;
    public soupply.bedrock261.type.PackWithSize[] resourcePacks;

    public ResourcePacksInfo()
    {
    }

    public ResourcePacksInfo(boolean mustAccept, soupply.bedrock261.type.PackWithSize[] behaviourPacks, soupply.bedrock261.type.PackWithSize[] resourcePacks)
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
        for(soupply.bedrock261.type.PackWithSize yvyzbvuf:behaviourPacks)
        {
            yvyzbvuf.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)resourcePacks.length);
        for(soupply.bedrock261.type.PackWithSize cvbvyvyn:resourcePacks)
        {
            cvbvyvyn.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        mustAccept = _buffer.readBool();
        final int bjafa9cb = _buffer.readVaruint();
        behaviourPacks = new soupply.bedrock261.type.PackWithSize[bjafa9cb];
        for(int yvyzbvuf=0;yvyzbvuf<behaviourPacks.length;yvyzbvuf++)
        {
            behaviourPacks[yvyzbvuf].decodeBody(_buffer);
        }
        final int bjc9cnuf = _buffer.readVaruint();
        resourcePacks = new soupply.bedrock261.type.PackWithSize[bjc9cnuf];
        for(int cvbvyvyn=0;cvbvyvyn<resourcePacks.length;cvbvyvyn++)
        {
            resourcePacks[cvbvyvyn].decodeBody(_buffer);
        }
    }

    public static ResourcePacksInfo fromBuffer(byte[] buffer)
    {
        ResourcePacksInfo packet = new ResourcePacksInfo();
        packet.safeDecode(buffer);
        return packet;
    }

}
