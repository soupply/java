package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

public class Link extends Type
{

    // action
    public static final byte ADD = 0;
    public static final byte RIDE = 1;
    public static final byte REMOVE = 2;

    public long from;
    public long to;
    public byte action;
    public byte unknown3;

    public Link()
    {
    }

    public Link(long from, long to, byte action, byte unknown3)
    {
        this.from = from;
        this.to = to;
        this.action = action;
        this.unknown3 = unknown3;
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
