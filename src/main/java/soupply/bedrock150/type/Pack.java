package soupply.bedrock150.type;

import java.util.*;
import soupply.util.*;

class Pack extends Type
{

    public String id;
    public String version;

    public Pack()
    {
    }

    public Pack(String id, String version)
    {
        this.id = id;
        this.version = version;
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
