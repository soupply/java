package soupply.java.type;

import java.util.*;
import soupply.util.*;

class Entry extends Type
{

    public soupply.java.type.Slot item;
    public byte craftingSlot;
    public byte playerSlot;

    public Entry()
    {
        this.item = new soupply.java.type.Slot();
    }

    public Entry(soupply.java.type.Slot item, byte craftingSlot, byte playerSlot)
    {
        this.item = item;
        this.craftingSlot = craftingSlot;
        this.playerSlot = playerSlot;
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
