package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class CraftingEvent extends soupply.bedrock150.Packet
{

    public byte window;
    public int type;
    public soupply.bedrock150.type.McpeUuid uuid;
    public soupply.bedrock150.type.Slot[] input;
    public soupply.bedrock150.type.Slot[] output;

    public CraftingEvent()
    {
    }

    public CraftingEvent(byte window, int type, soupply.bedrock150.type.McpeUuid uuid, soupply.bedrock150.type.Slot[] input, soupply.bedrock150.type.Slot[] output)
    {
        this.window = window;
        this.type = type;
        this.uuid = uuid;
        this.input = input;
        this.output = output;
    }

}
