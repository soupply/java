package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class AvailableCommands extends soupply.bedrock150.Packet
{

    public static final int ID = 76;

    public String[] enumValues;
    public String[] unknown1;
    public soupply.bedrock150.type.Enum[] enums;
    public soupply.bedrock150.type.Command[] commands;

    public AvailableCommands()
    {
    }

    public AvailableCommands(String[] enumValues, String[] unknown1, soupply.bedrock150.type.Enum[] enums, soupply.bedrock150.type.Command[] commands)
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
