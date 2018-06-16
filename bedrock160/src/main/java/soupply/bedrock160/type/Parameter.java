package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

class Parameter extends Type
{

    // type
    public static final int VALID = 1048576;
    public static final int INT = 1;
    public static final int FLOAT = 2;
    public static final int MIXED = 3;
    public static final int TARGET = 4;
    public static final int STRING = 13;
    public static final int POSITION = 14;
    public static final int RAWTEXT = 17;
    public static final int TEXT = 19;
    public static final int JSON = 22;
    public static final int COMMAND = 29;
    public static final int ENUM = 2097152;
    public static final int TEMPLATE = 16777216;

    public String name;
    public int type;
    public boolean optional;

    public Parameter()
    {
    }

    public Parameter(String name, int type, boolean optional)
    {
        this.name = name;
        this.type = type;
        this.optional = optional;
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
