package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class Map extends soupply.java316.Packet
{

    public static final int ID = 36;

    public int mapId;
    public byte scale;
    public boolean showIcons;
    public soupply.java316.type.Icon[] icons;
    public byte colums;
    public byte rows;
    public Tuples.ByteXZ offset;
    public byte[] data;

    public Map()
    {
    }

    public Map(int mapId, byte scale, boolean showIcons, soupply.java316.type.Icon[] icons, byte colums, byte rows, Tuples.ByteXZ offset, byte[] data)
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
