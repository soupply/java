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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)a.length);
        _buffer.writeBytes(a);
        byte[] yjy = _buffer.convertString(b);
        _buffer.writeVaruint((int)yjy.length);
        _buffer.writeBytes(yjy);
        _buffer.writeBigEndianInt((int)c.length);
        for(short yny:c)
        {
            _buffer.writeBigEndianShort(yny);
        }
        _buffer.writeVaruint((int)d.length);
        for(int zrz:d)
        {
            _buffer.writeVaruint(zrz);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bfy = _buffer.readVaruint();
        a = _buffer.readBytes(bfy);
        final int bvy = _buffer.readVaruint();
        b = _buffer.readString(bvy);
        final int bny = _buffer.readBigEndianInt();
        c = new short[bny];
        for(int yny=0;yny<c.length;yny++)
        {
            c[yny] = _buffer.readBigEndianShort();
        }
        final int brz = _buffer.readVaruint();
        d = new int[brz];
        for(int zrz=0;zrz<d.length;zrz++)
        {
            d[zrz] = _buffer.readVaruint();
        }
    }

    public static TestArray fromBuffer(byte[] buffer)
    {
        TestArray packet = new TestArray();
        packet.safeDecode(buffer);
        return packet;
    }

}
