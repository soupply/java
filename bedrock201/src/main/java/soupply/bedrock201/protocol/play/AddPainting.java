package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddPainting extends soupply.bedrock201.Packet
{

    public static final int ID = 22;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock201.type.BlockPosition position;
    public int direction;
    public String title;

    public AddPainting()
    {
        this.position = new soupply.bedrock201.type.BlockPosition();
    }

    public AddPainting(long entityId, long runtimeId, soupply.bedrock201.type.BlockPosition position, int direction, String title)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.direction = direction;
        this.title = title;
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
