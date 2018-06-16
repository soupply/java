package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

class Command extends Type
{

    public String name;
    public String description;
    public byte unknown2;
    public byte permissionLevel;
    public int aliasesEnum = -1;
    public soupply.bedrock201.type.Overload[] overloads;

    public Command()
    {
    }

    public Command(String name, String description, byte unknown2, byte permissionLevel, int aliasesEnum, soupply.bedrock201.type.Overload[] overloads)
    {
        this.name = name;
        this.description = description;
        this.unknown2 = unknown2;
        this.permissionLevel = permissionLevel;
        this.aliasesEnum = aliasesEnum;
        this.overloads = overloads;
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
