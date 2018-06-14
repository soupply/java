package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class EnchantItem extends soupply.java210.Packet
{

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

}
