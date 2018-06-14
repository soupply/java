package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class BlockPickRequest extends soupply.bedrock160.Packet
{

    public Tuples.IntXYZ position;
    public boolean unknown1;
    public byte slot;

    public BlockPickRequest()
    {
    }

    public BlockPickRequest(Tuples.IntXYZ position, boolean unknown1, byte slot)
    {
        this.position = position;
        this.unknown1 = unknown1;
        this.slot = slot;
    }

}
