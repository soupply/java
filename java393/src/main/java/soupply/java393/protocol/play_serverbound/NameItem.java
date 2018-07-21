package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class NameItem extends soupply.java393.Packet
{

    public static final int ID = 28;

    public String itemName;

    public NameItem()
    {
    }

    public NameItem(String itemName)
    {
        this.itemName = itemName;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] arb5bu = _buffer.convertString(itemName);
        _buffer.writeVaruint((int)arb5bu.length);
        _buffer.writeBytes(arb5bu);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvarb5bu = _buffer.readVaruint();
        itemName = _buffer.readString(bvarb5bu);
    }

    public static NameItem fromBuffer(byte[] buffer)
    {
        NameItem packet = new NameItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
