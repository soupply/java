package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock141.Packet
{

    public soupply.bedrock141.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
    }

    public BlockEntityData(soupply.bedrock141.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
    }

}
