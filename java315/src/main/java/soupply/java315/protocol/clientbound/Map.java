package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Map extends soupply.java315.Packet
{

    public static final int ID = 36;

    public int mapId;
    public byte scale;
    public boolean showIcons;
    public soupply.java315.type.Icon[] icons;
    public byte colums;
    public byte rows;
    public ByteXZ offset;
    public byte[] data;

    public Map()
    {
        this.offset = new ByteXZ();
    }

    public Map(int mapId, byte scale, boolean showIcons, soupply.java315.type.Icon[] icons, byte colums, byte rows, ByteXZ offset, byte[] data)
    {
        this.mapId = mapId;
        this.scale = scale;
        this.showIcons = showIcons;
        this.icons = icons;
        this.colums = colums;
        this.rows = rows;
        this.offset = offset;
        this.data = data;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(mapId);
        _buffer.writeByte(scale);
        _buffer.writeBool(showIcons);
        _buffer.writeVaruint((int)icons.length);
        for(soupply.java315.type.Icon anbm:icons)
        {
            anbm.encodeBody(_buffer);
        }
        _buffer.writeByte(colums);
        _buffer.writeByte(rows);
        _buffer.writeByte(offset.x);
        _buffer.writeByte(offset.z);
        _buffer.writeVaruint((int)data.length);
        _buffer.writeBytes(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        mapId = _buffer.readVaruint();
        scale = _buffer.readByte();
        showIcons = _buffer.readBool();
        final int blb5 = _buffer.readVaruint();
        for(int anbm=0;anbm<icons.length;anbm++)
        {
            icons[anbm].decodeBody(_buffer);
        }
        colums = _buffer.readByte();
        rows = _buffer.readByte();
        offset.x = _buffer.readByte();
        offset.z = _buffer.readByte();
        final int brde = _buffer.readVaruint();
        data = _buffer.readBytes(brde);
    }

    public static Map fromBuffer(byte[] buffer)
    {
        Map packet = new Map();
        packet.safeDecode(buffer);
        return packet;
    }

}
