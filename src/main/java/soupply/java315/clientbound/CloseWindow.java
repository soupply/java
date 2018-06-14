package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class CloseWindow extends soupply.java315.Packet
{

    public byte window;

    public CloseWindow()
    {
    }

    public CloseWindow(byte window)
    {
        this.window = window;
    }

}
