package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

public class Enum extends Type
{

    public String name;
    public short[] valuesIndexes;

    public Enum()
    {
    }

    public Enum(String name, short[] valuesIndexes)
    {
        this.name = name;
        this.valuesIndexes = valuesIndexes;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeVaruint((int)valuesIndexes.length);
        for(short dfdvs5zh:valuesIndexes)
        {
            _buffer.writeLittleEndianShort(dfdvs5zh);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int bzbvclzv = _buffer.readVaruint();
        valuesIndexes = new short[bzbvclzv];
        for(int dfdvs5zh=0;dfdvs5zh<valuesIndexes.length;dfdvs5zh++)
        {
            valuesIndexes[dfdvs5zh] = _buffer.readLittleEndianShort();
        }
    }

}
