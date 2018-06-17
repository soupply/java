package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Map extends soupply.java210.Packet
{

    public static final int ID = 36;

    public int mapId;
    public byte scale;
    public boolean showIcons;
    public soupply.java210.type.Icon[] icons;
    public byte colums;
    public byte rows;
    public ByteXZ offset;
    public byte[] data;

    public Map()
    {
        this.offset = new ByteXZ();
    }

    public Map(int mapId, byte scale, boolean showIcons, soupply.java210.type.Icon[] icons, byte colums, byte rows, ByteXZ offset, byte[] data)
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
        _buffer.writeBigEndianByte(scale);
        _buffer.writeBool(showIcons);
        _buffer.writeVaruint((int)icons.length);
        for(soupply.java210.type.Icon anbm:icons)
        {
            anbm.encodeBody(_buffer);
        }
        _buffer.writeBigEndianByte(colums);
        _buffer.writeBigEndianByte(rows);
        _buffer.writeBigEndianByte(offset.x);
        _buffer.writeBigEndianByte(offset.z);
        _buffer.writeVaruint((int)data.length);
        _buffer.writeBytes(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        mapId = _buffer.readVaruint();
        scale = _buffer.readBigEndianByte();
        showIcons = _buffer.readBool();
        final int blb5 = _buffer.readVaruint();
        for(int anbm=0;anbm<icons.length;anbm++)
        {
            icons[anbm].decodeBody(_buffer);
        }
        colums = _buffer.readBigEndianByte();
        rows = _buffer.readBigEndianByte();
        offset.x = _buffer.readBigEndianByte();
        offset.z = _buffer.readBigEndianByte();
        final int brde = _buffer.readVaruint();
        data = _buffer.readBytes(brde);
    }

    public static Map fromBuffer(byte[] buffer)
    {
        Map packet = new Map();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
