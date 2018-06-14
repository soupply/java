package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class BlockEvent extends soupply.bedrock160.Packet
{

    public soupply.bedrock160.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
    }

    public BlockEvent(soupply.bedrock160.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
    }

}
