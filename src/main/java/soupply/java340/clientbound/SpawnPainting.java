package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class SpawnPainting extends soupply.java340.Packet
{

    // direction
    public static final byte SOUTH = 0;
    public static final byte WEST = 1;
    public static final byte NORTH = 2;
    public static final byte EAST = 3;

    public int entityId;
    public UUID uuid;
    public String title;
    public long position;
    public byte direction;

    public SpawnPainting()
    {
    }

    public SpawnPainting(int entityId, UUID uuid, String title, long position, byte direction)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.title = title;
        this.position = position;
        this.direction = direction;
    }

}
