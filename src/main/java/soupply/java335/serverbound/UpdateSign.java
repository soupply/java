package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class UpdateSign extends soupply.java335.Packet
{

    public long position;
    public String[] lines;

    public UpdateSign()
    {
    }

    public UpdateSign(long position, String[] lines)
    {
        this.position = position;
        this.lines = lines;
    }

}
