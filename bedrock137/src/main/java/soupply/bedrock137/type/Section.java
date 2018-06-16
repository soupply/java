package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

class Section extends Type
{

    public byte storageVersion = 0;
    public byte[] blockIds;
    public byte[] blockMetas;

    public Section()
    {
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
