package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class PackWithSize extends Type
{

    public String id;
    public String version;
    public long size;
    public String unknown3;
    public String unknown4;

    public PackWithSize()
    {
    }

    public PackWithSize(String id, String version, long size, String unknown3, String unknown4)
    {
        this.id = id;
        this.version = version;
        this.size = size;
        this.unknown3 = unknown3;
        this.unknown4 = unknown4;
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
