package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class AvailableCommands extends soupply.bedrock137.Packet
{

    public String[] enumValues;
    public String[] unknown1;
    public soupply.bedrock137.type.Enum[] enums;
    public soupply.bedrock137.type.Command[] commands;

    public AvailableCommands()
    {
    }

    public AvailableCommands(String[] enumValues, String[] unknown1, soupply.bedrock137.type.Enum[] enums, soupply.bedrock137.type.Command[] commands)
    {
        this.enumValues = enumValues;
        this.unknown1 = unknown1;
        this.enums = enums;
        this.commands = commands;
    }

}
