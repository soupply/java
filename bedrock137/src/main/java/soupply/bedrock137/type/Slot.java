package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

class Slot extends Type
{

    public int id;
    public int metaAndCount;
    public byte[] nbt;
    public String[] canPlaceOn;
    public String[] canDestroy;

    public Slot()
    {
    }

    public Slot(int id, int metaAndCount, byte[] nbt, String[] canPlaceOn, String[] canDestroy)
    {
        this.id = id;
        this.metaAndCount = metaAndCount;
        this.nbt = nbt;
        this.canPlaceOn = canPlaceOn;
        this.canDestroy = canDestroy;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
