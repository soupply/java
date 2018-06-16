package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

class Overload extends Type
{

    public soupply.bedrock137.type.Parameter[] parameters;

    public Overload()
    {
    }

    public Overload(soupply.bedrock137.type.Parameter[] parameters)
    {
        this.parameters = parameters;
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
