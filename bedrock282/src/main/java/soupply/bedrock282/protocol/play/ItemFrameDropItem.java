package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class ItemFrameDropItem extends soupply.bedrock282.Packet
{

    public static final int ID = 71;

    public soupply.bedrock282.type.BlockPosition position;
    public soupply.bedrock282.type.Slot item;

    public ItemFrameDropItem()
    {
        this.position = new soupply.bedrock282.type.BlockPosition();
        this.item = new soupply.bedrock282.type.Slot();
    }

    public ItemFrameDropItem(soupply.bedrock282.type.BlockPosition position, soupply.bedrock282.type.Slot item)
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
    public void encodeBody(Buffer _buffer)
    {
        position.encodeBody(_buffer);
        item.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.decodeBody(_buffer);
        item.decodeBody(_buffer);
    }

    public static ItemFrameDropItem fromBuffer(byte[] buffer)
    {
        ItemFrameDropItem packet = new ItemFrameDropItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
