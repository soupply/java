package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class ItemFrameDropItem extends soupply.bedrock137.Packet
{

    public static final int ID = 71;

    public soupply.bedrock137.type.BlockPosition position;
    public soupply.bedrock137.type.Slot item;

    public ItemFrameDropItem()
    {
        this.position = new soupply.bedrock137.type.BlockPosition();
        this.item = new soupply.bedrock137.type.Slot();
    }

    public ItemFrameDropItem(soupply.bedrock137.type.BlockPosition position, soupply.bedrock137.type.Slot item)
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
