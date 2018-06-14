package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock137.Packet
{

    public soupply.bedrock137.type.BlockPosition position;
    public soupply.bedrock137.type.Slot item;

    public ItemFrameDropItem()
    {
    }

    public ItemFrameDropItem(soupply.bedrock137.type.BlockPosition position, soupply.bedrock137.type.Slot item)
    {
        this.position = position;
        this.item = item;
    }

}
