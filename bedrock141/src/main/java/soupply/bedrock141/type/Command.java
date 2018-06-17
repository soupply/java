package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Command extends Type
{

    public String name;
    public String description;
    public byte unknown2;
    public byte permissionLevel;
    public int aliasesEnum = -1;
    public soupply.bedrock141.type.Overload[] overloads;

    public Command()
    {
    }

    public Command(String name, String description, byte unknown2, byte permissionLevel, int aliasesEnum, soupply.bedrock141.type.Overload[] overloads)
    {
        this.name = name;
        this.description = description;
        this.unknown2 = unknown2;
        this.permissionLevel = permissionLevel;
        this.aliasesEnum = aliasesEnum;
        this.overloads = overloads;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        byte[] zvyjcrb4 = _buffer.convertString(description);
        _buffer.writeVaruint((int)zvyjcrb4.length);
        _buffer.writeBytes(zvyjcrb4);
        _buffer.writeByte(unknown2);
        _buffer.writeByte(permissionLevel);
        _buffer.writeLittleEndianInt(aliasesEnum);
        _buffer.writeVaruint((int)overloads.length);
        for(soupply.bedrock141.type.Overload bzcxyr:overloads)
        {
            bzcxyr.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int bvzvyjcr = _buffer.readVaruint();
        description = _buffer.readString(bvzvyjcr);
        unknown2 = _buffer.readByte();
        permissionLevel = _buffer.readByte();
        aliasesEnum = _buffer.readLittleEndianInt();
        final int b9zjbfc = _buffer.readVaruint();
        overloads = new soupply.bedrock141.type.Overload[b9zjbfc];
        for(int bzcxyr=0;bzcxyr<overloads.length;bzcxyr++)
        {
            overloads[bzcxyr].decodeBody(_buffer);
        }
    }

}
