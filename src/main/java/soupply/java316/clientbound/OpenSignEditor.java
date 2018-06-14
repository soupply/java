package soupply.java316.clientbound;

import java.util.*;
import soupply.util.*;

class OpenSignEditor extends soupply.java316.Packet
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
