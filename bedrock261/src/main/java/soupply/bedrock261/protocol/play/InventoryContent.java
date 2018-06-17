package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventoryContent extends soupply.bedrock261.Packet
{

    public static final int ID = 49;

    public int window;
    public soupply.bedrock261.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock261.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
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
