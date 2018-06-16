package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

public class BlockPosition extends Type
{

    public int x;
    public int y;
    public int z;

    public BlockPosition()
    {
    }

    public BlockPosition(int x, int y, int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
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
