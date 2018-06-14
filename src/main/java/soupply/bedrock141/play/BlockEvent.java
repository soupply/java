package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class BlockEvent extends soupply.bedrock141.Packet
{

    public soupply.bedrock141.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
    }

    public BlockEvent(soupply.bedrock141.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
    }

}
