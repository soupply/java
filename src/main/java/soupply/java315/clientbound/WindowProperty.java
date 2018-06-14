package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class WindowProperty extends soupply.java315.Packet
{

    // property
    public static final short FURNANCE_FIRE_ICON = 0;
    public static final short FURNACE_MAX_FUEL_BURN_TIME = 1;
    public static final short FURNACE_PROGRESS_ARROW = 2;
    public static final short FURNCE_MAX_PROGRESS = 3;
    public static final short ENCHANTMENT_LEVEL_REQUIREMENT_TOP = 0;
    public static final short ENCHANTMENT_LEVEL_REQUIREMENT_MIDDLE = 1;
    public static final short ENCHANTMENT_LEVEL_REQUIREMENT_BOTTOM = 2;
    public static final short ENCHANTMENT_SEED = 3;
    public static final short ENCHANTMENT_ID_TOP = 4;
    public static final short ENCHANTMENT_ID_MIDDLE = 5;
    public static final short ENCHANTMENT_ID_BOTTOM = 6;
    public static final short ENCHANTMENT_LEVEL_TOP = 7;
    public static final short ENCHANTMENT_LEVEL_MIDDLE = 8;
    public static final short ENCHANTMENT_LEVEL_BOTTOM = 9;
    public static final short BEACON_POWER_LEVEL = 0;
    public static final short BEACON_FIRST_EFFECT = 1;
    public static final short BEACON_SECOND_EFFECT = 2;
    public static final short ANVIL_REPAIR_COST = 0;
    public static final short BREWING_STAND_BREW_TIME = 0;

    public byte window;
    public short property;
    public short value;

    public WindowProperty()
    {
    }

    public WindowProperty(byte window, short property, short value)
    {
        this.window = window;
        this.property = property;
        this.value = value;
    }

}
