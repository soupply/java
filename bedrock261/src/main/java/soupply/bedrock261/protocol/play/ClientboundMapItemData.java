package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ClientboundMapItemData extends soupply.bedrock261.Packet
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
    public soupply.bedrock261.type.Decoration[] decorations;

    public ClientboundMapItemData()
    {
        this.size = new IntXZ();
        this.offset = new IntXZ();
    }

    public ClientboundMapItemData(long mapId, int update, byte scale, IntXZ size, IntXZ offset, byte[] data, soupply.bedrock261.type.Decoration[] decorations)
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(mapId);
        _buffer.writeVaruint(update);
        if(update==2||update==4)
        {
            _buffer.writeByte(scale);
        }
        if(update==2)
        {
            _buffer.writeVarint(size.x);
            _buffer.writeVarint(size.z);
            _buffer.writeVarint(offset.x);
            _buffer.writeVarint(offset.z);
            _buffer.writeBytes(data);
        }
        if(update==4)
        {
            _buffer.writeVaruint((int)decorations.length);
            for(soupply.bedrock261.type.Decoration zvbjdlbm:decorations)
            {
                zvbjdlbm.encodeBody(_buffer);
            }
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        mapId = _buffer.readVarlong();
        update = _buffer.readVaruint();
        if(update==2||update==4)
        {
            scale = _buffer.readByte();
        }
        if(update==2)
        {
            size.x = _buffer.readVarint();
            size.z = _buffer.readVarint();
            offset.x = _buffer.readVarint();
            offset.z = _buffer.readVarint();
            data = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
        }
        if(update==4)
        {
            final int bry9yrb5 = _buffer.readVaruint();
            decorations = new soupply.bedrock261.type.Decoration[bry9yrb5];
            for(int zvbjdlbm=0;zvbjdlbm<decorations.length;zvbjdlbm++)
            {
                decorations[zvbjdlbm].decodeBody(_buffer);
            }
        }
    }

    public static ClientboundMapItemData fromBuffer(byte[] buffer)
    {
        ClientboundMapItemData packet = new ClientboundMapItemData();
        packet.safeDecode(buffer);
        return packet;
    }

}
