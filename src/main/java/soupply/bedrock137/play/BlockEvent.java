package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class BlockEvent extends soupply.bedrock137.Packet
{

    public soupply.bedrock137.type.BlockPosition position;
    public int[] data;

    public BlockEvent()
    {
    }

    public BlockEvent(soupply.bedrock137.type.BlockPosition position, int[] data)
    {
        this.position = position;
        this.data = data;
    }

}
