package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock141.Packet
{

    public static final int ID = 49;

    public int window;
    public soupply.bedrock141.type.Slot[] slots;

    public InventoryContent()
    {
        this.slots = new soupply.bedrock141.type.Slot[]();
    }

    public InventoryContent(int window, soupply.bedrock141.type.Slot[] slots)
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
