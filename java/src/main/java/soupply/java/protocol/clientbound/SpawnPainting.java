package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPainting extends soupply.java.Packet
{

    public static final int ID = 4;

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
        this.uuid = new UUID();
    }

    public SpawnPainting(int entityId, UUID uuid, String title, long position, byte direction)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.title = title;
        this.position = position;
        this.direction = direction;
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
