package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class CraftingEvent extends soupply.bedrock261.Packet
{

    public static final int ID = 53;

    public byte window;
    public int type;
    public soupply.bedrock261.type.McpeUuid uuid;
    public soupply.bedrock261.type.Slot[] input;
    public soupply.bedrock261.type.Slot[] output;

    public CraftingEvent()
    {
        this.uuid = new soupply.bedrock261.type.McpeUuid();
    }

    public CraftingEvent(byte window, int type, soupply.bedrock261.type.McpeUuid uuid, soupply.bedrock261.type.Slot[] input, soupply.bedrock261.type.Slot[] output)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
