package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class BlockBreakAnimation extends soupply.java335.Packet
{

    public int entityId;
    public long position;
    public byte stage;

    public BlockBreakAnimation()
    {
    }

    public BlockBreakAnimation(int entityId, long position, byte stage)
    {
        this.entityId = entityId;
        this.position = position;
        this.stage = stage;
    }

}
