package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock137.Packet
{

    public static final int ID = 49;

    public int window;
    public soupply.bedrock137.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock137.type.Slot[] slots)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
