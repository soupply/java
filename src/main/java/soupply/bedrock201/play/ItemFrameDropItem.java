package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock201.Packet
{

    public soupply.bedrock201.type.BlockPosition position;
    public soupply.bedrock201.type.Slot item;

    public ItemFrameDropItem()
    {
    }

    public ItemFrameDropItem(soupply.bedrock201.type.BlockPosition position, soupply.bedrock201.type.Slot item)
    {
        this.position = position;
        this.item = item;
    }

}
