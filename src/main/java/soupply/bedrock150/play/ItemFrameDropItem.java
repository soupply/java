package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock150.Packet
{

    public soupply.bedrock150.type.BlockPosition position;
    public soupply.bedrock150.type.Slot item;

    public ItemFrameDropItem()
    {
    }

    public ItemFrameDropItem(soupply.bedrock150.type.BlockPosition position, soupply.bedrock150.type.Slot item)
    {
        this.position = position;
        this.item = item;
    }

}
