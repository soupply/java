package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class BlockEntityData extends soupply.bedrock137.Packet
{

    public soupply.bedrock137.type.BlockPosition position;
    public byte[] nbt;

    public BlockEntityData()
    {
    }

    public BlockEntityData(soupply.bedrock137.type.BlockPosition position, byte[] nbt)
    {
        this.position = position;
        this.nbt = nbt;
    }

}
