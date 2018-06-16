package soupply.java338.type;

import java.util.*;
import soupply.util.*;

public class Attribute extends Type
{

    public String key;
    public double value;
    public soupply.java338.type.Modifier[] modifiers;

    public Attribute()
    {
    }

    public Attribute(String key, double value, soupply.java338.type.Modifier[] modifiers)
    {
        this.key = key;
        this.value = value;
        this.modifiers = modifiers;
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
