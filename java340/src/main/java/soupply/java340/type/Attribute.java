package soupply.java340.type;

import java.util.*;
import soupply.util.*;

public class Attribute extends Type
{

    public String key;
    public double value;
    public soupply.java340.type.Modifier[] modifiers;

    public Attribute()
    {
    }

    public Attribute(String key, double value, soupply.java340.type.Modifier[] modifiers)
    {
        this.key = key;
        this.value = value;
        this.modifiers = modifiers;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] av = _buffer.convertString(key);
        _buffer.writeVaruint((int)av.length);
        _buffer.writeBytes(av);
        _buffer.writeBigEndianDouble(value);
        _buffer.writeVaruint((int)modifiers.length);
        for(soupply.java340.type.Modifier b9azzj:modifiers)
        {
            b9azzj.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvav = _buffer.readVaruint();
        key = _buffer.readString(bvav);
        value = _buffer.readBigEndianDouble();
        final int b1zlavc = _buffer.readVaruint();
        modifiers = new soupply.java340.type.Modifier[b1zlavc];
        for(int b9azzj=0;b9azzj<modifiers.length;b9azzj++)
        {
            modifiers[b9azzj].decodeBody(_buffer);
        }
    }

}
