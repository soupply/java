package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class EnchantItem extends soupply.java335.Packet
{

    public static final int ID = 7;

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
        _buffer.writeBigEndianByte(window);
        _buffer.writeBigEndianByte(enchantment);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readBigEndianByte();
        enchantment = _buffer.readBigEndianByte();
    }

    public static EnchantItem fromBuffer(byte[] buffer)
    {
        EnchantItem packet = new EnchantItem();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
