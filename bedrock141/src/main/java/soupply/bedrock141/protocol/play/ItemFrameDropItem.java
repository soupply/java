package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock141.Packet
{

    public static final int ID = 71;

    public soupply.bedrock141.type.BlockPosition position;
    public soupply.bedrock141.type.Slot item;

    public ItemFrameDropItem()
    {
        this.position = new soupply.bedrock141.type.BlockPosition();
        this.item = new soupply.bedrock141.type.Slot();
    }

    public ItemFrameDropItem(soupply.bedrock141.type.BlockPosition position, soupply.bedrock141.type.Slot item)
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
