package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ItemFrameDropItem extends soupply.bedrock261.Packet
{

    public static final int ID = 71;

    public soupply.bedrock261.type.BlockPosition position;
    public soupply.bedrock261.type.Slot item;

    public ItemFrameDropItem()
    {
        this.position = new soupply.bedrock261.type.BlockPosition();
        this.item = new soupply.bedrock261.type.Slot();
    }

    public ItemFrameDropItem(soupply.bedrock261.type.BlockPosition position, soupply.bedrock261.type.Slot item)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
