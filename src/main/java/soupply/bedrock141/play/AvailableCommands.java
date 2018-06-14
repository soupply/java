package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class AvailableCommands extends soupply.bedrock141.Packet
{

    public String[] enumValues;
    public String[] unknown1;
    public soupply.bedrock141.type.Enum[] enums;
    public soupply.bedrock141.type.Command[] commands;

    public AvailableCommands()
    {
    }

    public AvailableCommands(String[] enumValues, String[] unknown1, soupply.bedrock141.type.Enum[] enums, soupply.bedrock141.type.Command[] commands)
    {
        this.enumValues = enumValues;
        this.unknown1 = unknown1;
        this.enums = enums;
        this.commands = commands;
    }

}
