package soupply.java340.clientbound;

import java.util.*;
import soupply.util.*;

class OpenSignEditor extends soupply.java340.Packet
{

    public long position;

    public OpenSignEditor()
    {
    }

    public OpenSignEditor(long position)
    {
        this.position = position;
    }

}
