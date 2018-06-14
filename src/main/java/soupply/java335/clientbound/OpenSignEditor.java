package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class OpenSignEditor extends soupply.java335.Packet
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
