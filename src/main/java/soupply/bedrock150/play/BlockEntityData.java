package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock150.Packet
{

    public soupply.bedrock150.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
    }

    public BlockEntityData(soupply.bedrock150.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
    }

}
