package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class Parameter extends Type
{

    // type
    public static final int VALID = (int)1048576;
    public static final int INT = (int)1;
    public static final int FLOAT = (int)2;
    public static final int VALUE = (int)3;
    public static final int WILDCARD_INT = (int)4;
    public static final int TARGET = (int)5;
    public static final int WILDCARD_TARGET = (int)6;
    public static final int STRING = (int)15;
    public static final int POSITION = (int)16;
    public static final int MESSAGE = (int)19;
    public static final int RAWTEXT = (int)21;
    public static final int JSON = (int)24;
    public static final int COMMAND = (int)30;
    public static final int ENUM = (int)2097152;
    public static final int TEMPLATE = (int)16777216;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
