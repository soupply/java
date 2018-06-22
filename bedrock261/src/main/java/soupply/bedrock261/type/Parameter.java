package soupply.bedrock261.type;

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
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeLittleEndianInt(type);
        _buffer.writeBool(optional);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        type = _buffer.readLittleEndianInt();
        optional = _buffer.readBool();
    }

}
