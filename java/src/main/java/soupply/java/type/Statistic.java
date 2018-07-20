package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Statistic extends Type
{

    public int category;
    public int statistic;
    public int value;

    public Statistic()
    {
    }

    public Statistic(int category, int statistic, int value)
    {
        this.category = category;
        this.statistic = statistic;
        this.value = value;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(category);
        _buffer.writeVaruint(statistic);
        _buffer.writeVaruint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        category = _buffer.readVaruint();
        statistic = _buffer.readVaruint();
        value = _buffer.readVaruint();
    }

}
