package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class Recipe extends Type
{

    // type
    public static final int SHAPELESS = 0;
    public static final int SHAPED = 1;
    public static final int FURNACE = 2;
    public static final int FURNACE_DATA = 3;
    public static final int MULTI = 4;

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
    public void decodeBody(Buffer buffer)
    {
    }

}
