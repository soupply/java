package soupply.test0.protocol.test;

import java.util.*;
import soupply.util.*;

class TestInt extends soupply.test0.Packet
{

    public static final byte ID = 0;

    public byte a;
    public short b;
    public long c;
    public short d;
    public int e;

    public TestInt()
    {
    }

    public TestInt(byte a, short b, long c, short d, int e)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    @Override
    public byte getId()
    {
        return ID;
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
