package soupply.java315.clientbound;

import java.util.*;
import soupply.util.*;

class BlockChange extends soupply.java315.Packet
{

    public long position;
    public int block;

    public BlockChange()
    {
    }

    public BlockChange(long position, int block)
    {
        this.position = position;
        this.block = block;
    }

}
