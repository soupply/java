package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class BlockEvent extends soupply.bedrock150.Packet
{

    public soupply.bedrock150.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
    }

    public BlockEvent(soupply.bedrock150.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
    }

}
