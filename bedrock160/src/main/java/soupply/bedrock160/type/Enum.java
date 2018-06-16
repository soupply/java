package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

class Enum extends Type
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
