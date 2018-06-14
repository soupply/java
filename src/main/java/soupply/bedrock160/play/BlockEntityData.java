package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock160.Packet
{

    public soupply.bedrock160.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
    }

    public BlockEntityData(soupply.bedrock160.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
    }

}
