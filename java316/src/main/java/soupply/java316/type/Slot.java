package soupply.java316.type;

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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
