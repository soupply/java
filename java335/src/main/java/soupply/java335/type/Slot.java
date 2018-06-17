package soupply.java335.type;

import java.util.*;
import soupply.util.*;

public class Slot extends Type
{

    public short id;
    public byte count;
    public short damage;
    public byte[] nbt;

    public Slot()
    {
    }

    public Slot(short id, byte count, short damage, byte[] nbt)
    {
        this.id = id;
        this.count = count;
        this.damage = damage;
        this.nbt = nbt;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianShort(id);
        _buffer.writeBigEndianByte(count);
        _buffer.writeBigEndianShort(damage);
        _buffer.writeBytes(nbt);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        id = _buffer.readBigEndianShort();
        count = _buffer.readBigEndianByte();
        damage = _buffer.readBigEndianShort();
        nbt = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

}
