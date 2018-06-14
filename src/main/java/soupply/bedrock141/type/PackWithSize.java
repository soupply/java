package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class PackWithSize extends Type
{

    public String id;
    public String version;
    public long size;

    public PackWithSize()
    {
    }

    public PackWithSize(String id, String version, long size)
    {
        this.id = id;
        this.version = version;
        this.size = size;
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
