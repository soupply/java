package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class EnchantItem extends soupply.java315.Packet
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
