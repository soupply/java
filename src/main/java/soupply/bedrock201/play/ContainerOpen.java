package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ContainerOpen extends soupply.bedrock201.Packet
{

    public byte window;
    public byte type;
    public soupply.bedrock201.type.BlockPosition position;
    public long entityId;

    public ContainerOpen()
    {
    }

    public ContainerOpen(byte window, byte type, soupply.bedrock201.type.BlockPosition position, long entityId)
    {
        this.window = window;
        this.type = type;
        this.position = position;
        this.entityId = entityId;
    }

}
