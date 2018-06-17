package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class BlockChange extends Type
{

    public byte xz;
    public byte y;
    public int block;

    public BlockChange()
    {
    }

    public BlockChange(byte xz, byte y, int block)
    {
        this.xz = xz;
        this.y = y;
        this.block = block;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianByte(xz);
        _buffer.writeBigEndianByte(y);
        _buffer.writeVaruint(block);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        xz = _buffer.readBigEndianByte();
        y = _buffer.readBigEndianByte();
        block = _buffer.readVaruint();
    }

}
