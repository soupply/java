package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ContainerOpen extends soupply.bedrock160.Packet
{

    public byte window;
    public byte type;
    public soupply.bedrock160.type.BlockPosition position;
    public long entityId;

    public ContainerOpen()
    {
    }

    public ContainerOpen(byte window, byte type, soupply.bedrock160.type.BlockPosition position, long entityId)
    {
        this.window = window;
        this.type = type;
        this.position = position;
        this.entityId = entityId;
    }

}
