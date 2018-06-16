package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

class Overload extends Type
{

    public soupply.bedrock160.type.Parameter[] parameters;

    public Overload()
    {
        this.parameters = new soupply.bedrock160.type.Parameter[]();
    }

    public Overload(soupply.bedrock160.type.Parameter[] parameters)
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
