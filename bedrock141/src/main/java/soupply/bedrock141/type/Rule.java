package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Rule extends Type
{

    // name
    public static final String COMMAND_BLOCK_OUTPUT = "commandblockoutput";
    public static final String DO_DAYLIGHT_CYCLE = "dodaylightcycle";
    public static final String DO_ENTITY_DROPS = "doentitydrops";
    public static final String DO_FIRE_TICK = "dofiretick";
    public static final String DO_MOB_LOOT = "domobloot";
    public static final String DO_MOB_SPAWNING = "domobspawning";
    public static final String DO_TILE_DROPS = "dotiledrops";
    public static final String DO_WEATHER_CYCLE = "doweathercycle";
    public static final String DROWNING_DAMAGE = "drowningdamage";
    public static final String FALL_DAMAGE = "falldamage";
    public static final String FIRE_DAMAGE = "firedamage";
    public static final String KEEP_INVENTORY = "keepinventory";
    public static final String MOB_GRIEFING = "mobgriefing";
    public static final String PVP = "pvp";
    public static final String SEND_COMMAND_FEEDBACK = "sendcommandfeedback";

    // type
    public static final byte BOOLEAN = (byte)1;
    public static final byte INTEGER = (byte)2;
    public static final byte FLOATING = (byte)3;

    public String name;
    public byte type;
    public boolean booleanValue;
    public int integerValue;
    public float floatingValue;

    public Rule()
    {
    }

    public Rule(String name, byte type, boolean booleanValue, int integerValue, float floatingValue)
    {
        this.name = name;
        this.type = type;
        this.booleanValue = booleanValue;
        this.integerValue = integerValue;
        this.floatingValue = floatingValue;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeLittleEndianByte(type);
        _buffer.writeBool(booleanValue);
        _buffer.writeVaruint(integerValue);
        _buffer.writeLittleEndianFloat(floatingValue);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        type = _buffer.readLittleEndianByte();
        booleanValue = _buffer.readBool();
        integerValue = _buffer.readVaruint();
        floatingValue = _buffer.readLittleEndianFloat();
    }

}
