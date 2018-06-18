package soupply.bedrock261.type;

import java.util.*;
import soupply.util.*;

public class Slot extends Type
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(id);
        _buffer.writeVarint(metaAndCount);
        _buffer.writeLittleEndianShort((short)nbt.length);
        _buffer.writeBytes(nbt);
        _buffer.writeVaruint((int)canPlaceOn.length);
        for(String yfuxyvb:canPlaceOn)
        {
            byte[] ezely = _buffer.convertString(yfuxyvb);
            _buffer.writeVaruint((int)ezely.length);
            _buffer.writeBytes(ezely);
        }
        _buffer.writeVaruint((int)canDestroy.length);
        for(String yfrvdje:canDestroy)
        {
            byte[] ezdrz = _buffer.convertString(yfrvdje);
            _buffer.writeVaruint((int)ezdrz.length);
            _buffer.writeBytes(ezdrz);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        id = _buffer.readVarint();
        metaAndCount = _buffer.readVarint();
        final int b5d = _buffer.readLittleEndianShort();
        nbt = _buffer.readBytes(b5d);
        final int bnbbynt4 = _buffer.readVaruint();
        canPlaceOn = new String[bnbbynt4];
        for(int yfuxyvb=0;yfuxyvb<canPlaceOn.length;yfuxyvb++)
        {
            final int bvyfuxyv = _buffer.readVaruint();
            canPlaceOn[yfuxyvb] = _buffer.readString(bvyfuxyv);
        }
        final int bnbrcrbk = _buffer.readVaruint();
        canDestroy = new String[bnbrcrbk];
        for(int yfrvdje=0;yfrvdje<canDestroy.length;yfrvdje++)
        {
            final int bvyfrvdj = _buffer.readVaruint();
            canDestroy[yfrvdje] = _buffer.readString(bvyfrvdj);
        }
    }

}
