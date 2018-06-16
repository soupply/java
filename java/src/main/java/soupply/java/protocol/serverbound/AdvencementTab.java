package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class AdvencementTab extends soupply.java.Packet
{

    public static final int ID = 25;

    // action
    public static final int OPEN_TAB = 0;
    public static final int CLOSE_SCREEN = 1;

    public int action;
    public String tab;

    public AdvencementTab()
    {
    }

    public AdvencementTab(int action, String tab)
    {
        this.action = action;
        this.tab = tab;
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
