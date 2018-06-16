package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

class Section extends Type
{

    public byte storageVersion = 0;
    public byte[] blockIds;
    public byte[] blockMetas;

    public Section()
    {
        this.blockIds = new byte[4096];
        this.blockMetas = new byte[2048];
    }

    public Section(byte storageVersion, byte[] blockIds, byte[] blockMetas)
    {
        this.storageVersion = storageVersion;
        this.blockIds = blockIds;
        this.blockMetas = blockMetas;
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
