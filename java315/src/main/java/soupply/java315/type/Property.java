package soupply.java315.type;

import java.util.*;
import soupply.util.*;

public class Property extends Type
{

    public String name;
    public String value;
    public boolean signed;
    public String signature;

    public Property()
    {
    }

    public Property(String name, String value, boolean signed, String signature)
    {
        this.name = name;
        this.value = value;
        this.signed = signed;
        this.signature = signature;
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
