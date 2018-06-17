package soupply.java316.type;

import java.util.*;
import soupply.util.*;

public class Icon extends Type
{

    // direction and type
    public static final byte WHITE_ARROW = (byte)0;
    public static final byte GREEN_ARROW = (byte)1;
    public static final byte RED_ARROW = (byte)2;
    public static final byte BLUE_ARROW = (byte)3;
    public static final byte WHITE_CROSS = (byte)4;
    public static final byte RED_POINTER = (byte)5;
    public static final byte WHITE_CIRCLE = (byte)6;
    public static final byte SMALL_WHITE_CIRCLE = (byte)7;
    public static final byte MANSION = (byte)8;
    public static final byte TEMPLE = (byte)9;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
