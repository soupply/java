package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

class Pack extends Type
{

    public String id;
    public String version;
    public String unknown2;

    public Pack()
    {
    }

    public Pack(String id, String version, String unknown2)
    {
        this.id = id;
        this.version = version;
        this.unknown2 = unknown2;
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
