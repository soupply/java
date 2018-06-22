package soupply.test0.protocol.test;

import java.util.*;
import soupply.util.*;

public class TestInt extends soupply.test0.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(a);
        _buffer.writeBigEndianShort(b);
        _buffer.writeLittleEndianLong(c);
        _buffer.writeVarshort(d);
        _buffer.writeVaruint(e);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        a = _buffer.readByte();
        b = _buffer.readBigEndianShort();
        c = _buffer.readLittleEndianLong();
        d = _buffer.readVarshort();
        e = _buffer.readVaruint();
    }

    public static TestInt fromBuffer(byte[] buffer)
    {
        TestInt packet = new TestInt();
        packet.safeDecode(buffer);
        return packet;
    }

}
