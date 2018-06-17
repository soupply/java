package soupply.java316.type;

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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
