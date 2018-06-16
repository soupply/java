package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class ItemFrameDropItem extends soupply.bedrock.Packet
{

    public static final int ID = 71;

    public soupply.bedrock.type.BlockPosition position;
    public soupply.bedrock.type.Slot item;

    public ItemFrameDropItem()
    {
        this.position = new soupply.bedrock.type.BlockPosition();
        this.item = new soupply.bedrock.type.Slot();
    }

    public ItemFrameDropItem(soupply.bedrock.type.BlockPosition position, soupply.bedrock.type.Slot item)
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
