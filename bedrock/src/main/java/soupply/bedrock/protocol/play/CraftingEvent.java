package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class CraftingEvent extends soupply.bedrock.Packet
{

    public static final int ID = 53;

    public byte window;
    public int type;
    public soupply.bedrock.type.McpeUuid uuid;
    public soupply.bedrock.type.Slot[] input;
    public soupply.bedrock.type.Slot[] output;

    public CraftingEvent()
    {
        this.uuid = new soupply.bedrock.type.McpeUuid();
    }

    public CraftingEvent(byte window, int type, soupply.bedrock.type.McpeUuid uuid, soupply.bedrock.type.Slot[] input, soupply.bedrock.type.Slot[] output)
    {
        this.window = window;
        this.type = type;
        this.uuid = uuid;
        this.input = input;
        this.output = output;
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
