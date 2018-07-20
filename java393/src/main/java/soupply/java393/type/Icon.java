package soupply.java393.type;

import java.util.*;
import soupply.util.*;

public class Icon extends Type
{

    // type
    public static final int WHITE_ARROW = (int)0;
    public static final int GREEN_ARROW = (int)1;
    public static final int RED_ARROW = (int)2;
    public static final int BLUE_ARROW = (int)3;
    public static final int WHITE_CROSS = (int)4;
    public static final int RED_POINTER = (int)5;
    public static final int WHITE_CIRCLE = (int)6;
    public static final int SMALL_WHITE_CIRCLE = (int)7;
    public static final int MANSION = (int)8;
    public static final int TEMPLE = (int)9;
    public static final int WHITE_BANNER = (int)10;
    public static final int ORANGE_BANNER = (int)11;
    public static final int MAGENTA_BANNER = (int)12;
    public static final int LIGHT_BLUE_BANNER = (int)13;
    public static final int YELLOW_BANNER = (int)14;
    public static final int LIME_BANNER = (int)15;
    public static final int PINK_BANNER = (int)16;
    public static final int GRAY_BANNER = (int)17;
    public static final int LIGHT_GRAY_BANNER = (int)18;
    public static final int CYAN_BANNER = (int)19;
    public static final int PURPLE_BANNER = (int)20;
    public static final int BLUE_BANNER = (int)21;
    public static final int BROWN_BANNER = (int)22;
    public static final int GREEN_BANNER = (int)23;
    public static final int RED_BANNER = (int)24;
    public static final int BLACK_BANNER = (int)25;
    public static final int TREASURE_MARKER = (int)26;

    public int type;
    public byte x;
    public byte z;
    public byte direction;
    public boolean hasDisplayName;
    public String displayName;

    public Icon()
    {
    }

    public Icon(int type, byte x, byte z, byte direction, boolean hasDisplayName, String displayName)
    {
        this.type = type;
        this.x = x;
        this.z = z;
        this.direction = direction;
        this.hasDisplayName = hasDisplayName;
        this.displayName = displayName;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
        _buffer.writeByte(x);
        _buffer.writeByte(z);
        _buffer.writeByte(direction);
        _buffer.writeBool(hasDisplayName);
        if(hasDisplayName==true)
        {
            byte[] zlcxe5bu = _buffer.convertString(displayName);
            _buffer.writeVaruint((int)zlcxe5bu.length);
            _buffer.writeBytes(zlcxe5bu);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        type = _buffer.readVaruint();
        x = _buffer.readByte();
        z = _buffer.readByte();
        direction = _buffer.readByte();
        hasDisplayName = _buffer.readBool();
        if(hasDisplayName==true)
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
        }
    }

}
