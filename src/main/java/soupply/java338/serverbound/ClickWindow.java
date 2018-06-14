package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class ClickWindow extends soupply.java338.Packet
{

    public byte window;
    public short slot;
    public byte button;
    public short action;
    public int mode;
    public soupply.java338.type.Slot clickedItem;

    public ClickWindow()
    {
    }

    public ClickWindow(byte window, short slot, byte button, short action, int mode, soupply.java338.type.Slot clickedItem)
    {
        this.window = window;
        this.slot = slot;
        this.button = button;
        this.action = action;
        this.mode = mode;
        this.clickedItem = clickedItem;
    }

}
