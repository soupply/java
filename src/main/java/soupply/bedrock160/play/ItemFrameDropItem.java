package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock160.Packet
{

    public soupply.bedrock160.type.BlockPosition position;
    public soupply.bedrock160.type.Slot item;

    public ItemFrameDropItem()
    {
    }

    public ItemFrameDropItem(soupply.bedrock160.type.BlockPosition position, soupply.bedrock160.type.Slot item)
    {
        this.position = position;
        this.item = item;
    }

}
