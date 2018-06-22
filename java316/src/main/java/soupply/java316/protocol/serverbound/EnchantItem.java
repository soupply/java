package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class EnchantItem extends soupply.java316.Packet
{

    public static final int ID = 6;

    public byte window;
    public byte enchantment;

    public EnchantItem()
    {
    }

    public EnchantItem(byte window, byte enchantment)
    {
        this.window = window;
        this.enchantment = enchantment;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeByte(enchantment);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        enchantment = _buffer.readByte();
    }

    public static EnchantItem fromBuffer(byte[] buffer)
    {
        EnchantItem packet = new EnchantItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
