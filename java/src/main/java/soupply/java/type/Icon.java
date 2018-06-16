package soupply.java.type;

import java.util.*;
import soupply.util.*;

class Icon extends Type
{

    // direction and type
    public static final byte WHITE_ARROW = 0;
    public static final byte GREEN_ARROW = 1;
    public static final byte RED_ARROW = 2;
    public static final byte BLUE_ARROW = 3;
    public static final byte WHITE_CROSS = 4;
    public static final byte RED_POINTER = 5;
    public static final byte WHITE_CIRCLE = 6;
    public static final byte SMALL_WHITE_CIRCLE = 7;
    public static final byte MANSION = 8;
    public static final byte TEMPLE = 9;

    public byte directionAndType;
    public ByteXZ position;

    public Icon()
    {
        this.position = new ByteXZ();
    }

    public Icon(byte directionAndType, ByteXZ position)
    {
        this.directionAndType = directionAndType;
        this.position = position;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
