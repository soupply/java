package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class Command extends Type
{

    public String name;
    public String description;
    public byte unknown2;
    public byte permissionLevel;
    public int aliasesEnum = -1;
    public soupply.bedrock141.type.Overload[] overloads;

    public Command()
    {
        this.overloads = new soupply.bedrock141.type.Overload[]();
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}