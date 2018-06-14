package soupply.java210.serverbound;

import java.util.*;
import soupply.util.*;

class UpdateSign extends soupply.java210.Packet
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
