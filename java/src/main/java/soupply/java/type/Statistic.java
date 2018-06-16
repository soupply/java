package soupply.java.type;

import java.util.*;
import soupply.util.*;

class Statistic extends Type
{

    public String name;
    public int value;

    public Statistic()
    {
    }

    public Statistic(String name, int value)
    {
        this.name = name;
        this.value = value;
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
