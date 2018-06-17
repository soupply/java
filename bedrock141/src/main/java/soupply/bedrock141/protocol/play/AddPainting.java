package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddPainting extends soupply.bedrock141.Packet
{

    public static final int ID = 22;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock141.type.BlockPosition position;
    public int direction;
    public String title;

    public AddPainting()
    {
        this.position = new soupply.bedrock141.type.BlockPosition();
    }

    public AddPainting(long entityId, long runtimeId, soupply.bedrock141.type.BlockPosition position, int direction, String title)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
