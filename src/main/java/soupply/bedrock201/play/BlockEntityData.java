package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock201.Packet
{

    public soupply.bedrock201.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
    }

    public BlockEntityData(soupply.bedrock201.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
    }

}
