package soupply.java340.type;

import java.util.*;
import soupply.util.*;

class Entry extends Type
{

    public soupply.java340.type.Slot item;
    public byte craftingSlot;
    public byte playerSlot;

    public Entry()
    {
    }

    public Entry(soupply.java340.type.Slot item, byte craftingSlot, byte playerSlot)
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
