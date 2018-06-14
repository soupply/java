package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class AdvencementTab extends soupply.java338.Packet
{

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

}
