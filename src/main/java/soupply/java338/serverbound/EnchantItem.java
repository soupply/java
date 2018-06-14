package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class EnchantItem extends soupply.java338.Packet
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
