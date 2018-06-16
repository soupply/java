package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock150.Packet
{

    public static final int ID = 71;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
