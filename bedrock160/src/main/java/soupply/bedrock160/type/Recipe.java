package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

public class Recipe extends Type
{

    // type
    public static final int SHAPELESS = (int)0;
    public static final int SHAPED = (int)1;
    public static final int FURNACE = (int)2;
    public static final int FURNACE_DATA = (int)3;
    public static final int MULTI = (int)4;

    public int type;
    public byte[] data;

    public Recipe()
    {
    }

    public Recipe(int type, byte[] data)
    {
        this.type = type;
        this.data = data;
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
