package soupply.java210.type;

import java.util.*;
import soupply.util.*;

public class Statistic extends Type
{

    public String name;
    public int value;

    public Statistic()
    {
    }

    public Statistic(String name, int value)
    {
        this.name = name;
        this.value = value;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeVaruint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        value = _buffer.readVaruint();
    }

}
