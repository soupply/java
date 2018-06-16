package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

class Attribute extends Type
{

    public float min;
    public float max;
    public float value;
    public float default_;
    public String name;

    public Attribute()
    {
    }

    public Attribute(float min, float max, float value, float default_, String name)
    {
        this.min = min;
        this.max = max;
        this.value = value;
        this.default_ = default_;
        this.name = name;
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
