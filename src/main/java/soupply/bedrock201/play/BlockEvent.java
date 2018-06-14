package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class BlockEvent extends soupply.bedrock201.Packet
{

    public soupply.bedrock201.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
    }

    public BlockEvent(soupply.bedrock201.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
    }

}
