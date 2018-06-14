package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class TabComplete extends soupply.java338.Packet
{

    public String text;
    public boolean command;
    public boolean hasPosition;
    public long block;

    public TabComplete()
    {
    }

    public TabComplete(String text, boolean command, boolean hasPosition, long block)
    {
        this.text = text;
        this.command = command;
        this.hasPosition = hasPosition;
        this.block = block;
    }

}
