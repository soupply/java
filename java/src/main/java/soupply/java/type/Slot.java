package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Slot extends Type
{

    public short id;
    public byte count;
    public byte[] nbt;

    public Slot()
    {
    }

    public Slot(short id, byte count, byte[] nbt)
    {
        this.id = id;
        this.count = count;
        this.nbt = nbt;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianShort(id);
        if(id>0)
        {
            _buffer.writeByte(count);
            _buffer.writeBytes(nbt);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        id = _buffer.readBigEndianShort();
        if(id>0)
        {
            count = _buffer.readByte();
            nbt = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
        }
    }

}
