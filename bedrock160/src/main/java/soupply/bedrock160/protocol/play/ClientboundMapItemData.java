package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class ClientboundMapItemData extends soupply.bedrock160.Packet
{

    public static final int ID = 67;

    // update
    public static final int TEXTURE = (int)2;
    public static final int DECORATIONS = (int)4;
    public static final int ENTITIES = (int)8;

    public long mapId;
    public int update;
    public byte scale;
    public IntXZ size;
    public IntXZ offset;
    public byte[] data;
    public soupply.bedrock160.type.Decoration[] decorations;

    public ClientboundMapItemData()
    {
        this.size = new IntXZ();
        this.offset = new IntXZ();
    }

    public ClientboundMapItemData(long mapId, int update, byte scale, IntXZ size, IntXZ offset, byte[] data, soupply.bedrock160.type.Decoration[] decorations)
    {
        this.mapId = mapId;
        this.update = update;
        this.scale = scale;
        this.size = size;
        this.offset = offset;
        this.data = data;
        this.decorations = decorations;
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
