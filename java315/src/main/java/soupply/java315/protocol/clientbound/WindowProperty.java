package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class WindowProperty extends soupply.java315.Packet
{

    public static final int ID = 21;

    // property
    public static final short FURNANCE_FIRE_ICON = (short)0;
    public static final short FURNACE_MAX_FUEL_BURN_TIME = (short)1;
    public static final short FURNACE_PROGRESS_ARROW = (short)2;
    public static final short FURNCE_MAX_PROGRESS = (short)3;
    public static final short ENCHANTMENT_LEVEL_REQUIREMENT_TOP = (short)0;
    public static final short ENCHANTMENT_LEVEL_REQUIREMENT_MIDDLE = (short)1;
    public static final short ENCHANTMENT_LEVEL_REQUIREMENT_BOTTOM = (short)2;
    public static final short ENCHANTMENT_SEED = (short)3;
    public static final short ENCHANTMENT_ID_TOP = (short)4;
    public static final short ENCHANTMENT_ID_MIDDLE = (short)5;
    public static final short ENCHANTMENT_ID_BOTTOM = (short)6;
    public static final short ENCHANTMENT_LEVEL_TOP = (short)7;
    public static final short ENCHANTMENT_LEVEL_MIDDLE = (short)8;
    public static final short ENCHANTMENT_LEVEL_BOTTOM = (short)9;
    public static final short BEACON_POWER_LEVEL = (short)0;
    public static final short BEACON_FIRST_EFFECT = (short)1;
    public static final short BEACON_SECOND_EFFECT = (short)2;
    public static final short ANVIL_REPAIR_COST = (short)0;
    public static final short BREWING_STAND_BREW_TIME = (short)0;

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

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeBigEndianShort(property);
        _buffer.writeBigEndianShort(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        property = _buffer.readBigEndianShort();
        value = _buffer.readBigEndianShort();
    }

    public static WindowProperty fromBuffer(byte[] buffer)
    {
        WindowProperty packet = new WindowProperty();
        packet.safeDecode(buffer);
        return packet;
    }

}
