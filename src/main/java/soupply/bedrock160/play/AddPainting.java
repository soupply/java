package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class AddPainting extends soupply.bedrock160.Packet
{

    public long entityId;
    public long runtimeId;
    public soupply.bedrock160.type.BlockPosition position;
    public int direction;
    public String title;

    public AddPainting()
    {
    }

    public AddPainting(long entityId, long runtimeId, soupply.bedrock160.type.BlockPosition position, int direction, String title)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.direction = direction;
        this.title = title;
    }

}
