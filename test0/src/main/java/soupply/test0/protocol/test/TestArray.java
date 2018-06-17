package soupply.test0.protocol.test;

import java.util.*;
import soupply.util.*;

public class TestArray extends soupply.test0.Packet
{

    public static final byte ID = 2;

    public byte[] a;
    public String b;
    public short[] c;
    public int[] d;

    public TestArray()
    {
    }

    public TestArray(byte[] a, String b, short[] c, int[] d)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
