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
        byte[] y = _buffer.convertString(b);
        _buffer.writeVaruint((int)y.length);
        _buffer.writeBytes(y);
        _buffer.writeVaruint((int)c.length);
        for(short y:c)
        {
            _buffer.writeBigEndianShort(y);
        }
        _buffer.writeVaruint((int)d.length);
        for(int z:d)
        {
            _buffer.writeVaruint(z);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int be = _buffer.readVaruint();
        a = _buffer.readBytes(be);
        final int bvy = _buffer.readVaruint();
        b = _buffer.readString(bvy);
        final int bm = _buffer.readVaruint();
        for(int y=0;y<c.length;y++)
        {
            c[y] = _buffer.readBigEndianShort();
        }
        final int bq = _buffer.readVaruint();
        for(int z=0;z<d.length;z++)
        {
            d[z] = _buffer.readVaruint();
        }
    }

    public static TestArray fromBuffer(byte[] buffer)
    {
        TestArray packet = new TestArray();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
