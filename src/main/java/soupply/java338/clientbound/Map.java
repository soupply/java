package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class Map extends soupply.java338.Packet
{

    public int mapId;
    public byte scale;
    public boolean showIcons;
    public soupply.java338.type.Icon[] icons;
    public byte colums;
    public byte rows;
    public Tuples.ByteXZ offset;
    public byte[] data;

    public Map()
    {
    }

    public Map(int mapId, byte scale, boolean showIcons, soupply.java338.type.Icon[] icons, byte colums, byte rows, Tuples.ByteXZ offset, byte[] data)
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

}
