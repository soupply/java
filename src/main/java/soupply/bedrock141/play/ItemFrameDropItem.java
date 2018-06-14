package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock141.Packet
{

    public soupply.bedrock141.type.BlockPosition position;
    public soupply.bedrock141.type.Slot item;

    public ItemFrameDropItem()
    {
    }

    public ItemFrameDropItem(soupply.bedrock141.type.BlockPosition position, soupply.bedrock141.type.Slot item)
    {
        this.position = position;
        this.item = item;
    }

}
