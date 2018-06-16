package soupply.java335.type;

import java.util.*;
import soupply.util.*;

public class Entry extends Type
{

    public soupply.java335.type.Slot item;
    public byte craftingSlot;
    public byte playerSlot;

    public Entry()
    {
        this.item = new soupply.java335.type.Slot();
    }

    public Entry(soupply.java335.type.Slot item, byte craftingSlot, byte playerSlot)
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
