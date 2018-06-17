package soupply.test0.protocol.test;

import java.util.*;
import soupply.util.*;

public class TestFloat extends soupply.test0.Packet
{

    public static final byte ID = 1;

    public float a;
    public double b;
    public float c;

    public TestFloat()
    {
    }

    public TestFloat(float a, double b, float c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
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
