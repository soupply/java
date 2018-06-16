package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock201.Packet
{

    public static final int ID = 49;

    public int window;
    public soupply.bedrock201.type.Slot[] slots;

    public InventoryContent()
    {
        this.slots = new soupply.bedrock201.type.Slot[]();
    }

    public InventoryContent(int window, soupply.bedrock201.type.Slot[] slots)
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
