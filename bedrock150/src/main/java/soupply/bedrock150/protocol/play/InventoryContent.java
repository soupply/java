package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventoryContent extends soupply.bedrock150.Packet
{

    public static final int ID = 49;

    public int window;
    public soupply.bedrock150.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock150.type.Slot[] slots)
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
