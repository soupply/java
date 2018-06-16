package soupply.java335.type;

import java.util.*;
import soupply.util.*;

public class Statistic extends Type
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
