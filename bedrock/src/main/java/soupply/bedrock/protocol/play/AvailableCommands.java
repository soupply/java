package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class AvailableCommands extends soupply.bedrock.Packet
{

    public static final int ID = 76;

    public String[] enumValues;
    public String[] unknown1;
    public soupply.bedrock.type.Enum[] enums;
    public soupply.bedrock.type.Command[] commands;

    public AvailableCommands()
    {
        this.enums = new soupply.bedrock.type.Enum[]();
        this.commands = new soupply.bedrock.type.Command[]();
    }

    public AvailableCommands(String[] enumValues, String[] unknown1, soupply.bedrock.type.Enum[] enums, soupply.bedrock.type.Command[] commands)
    {
        this.enumValues = enumValues;
        this.unknown1 = unknown1;
        this.enums = enums;
        this.commands = commands;
    }

    @Override
    public int getId()
    {
        return ID;
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
