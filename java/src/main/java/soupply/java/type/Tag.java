package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Tag extends Type
{

    public String name;
    public int[] entries;

    public Tag()
    {
    }

    public Tag(String name, int[] entries)
    {
        this.name = name;
        this.entries = entries;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeVaruint((int)entries.length);
        for(int z5clc:entries)
        {
            _buffer.writeVaruint(z5clc);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int bvdjzm = _buffer.readVaruint();
        entries = new int[bvdjzm];
        for(int z5clc=0;z5clc<entries.length;z5clc++)
        {
            entries[z5clc] = _buffer.readVaruint();
        }
    }

}
