package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class OpenWindow extends soupply.java338.Packet
{

    public byte window;
    public String type;
    public String title;
    public byte slots;

    public OpenWindow()
    {
    }

    public OpenWindow(byte window, String type, String title, byte slots)
    {
        this.window = window;
        this.type = type;
        this.title = title;
        this.slots = slots;
    }

}
