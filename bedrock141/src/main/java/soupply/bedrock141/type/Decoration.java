package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class Decoration extends Type
{

    public int rotationAndIcon;
    public Tuples.ByteXZ position;
    public String label;
    public int color;

    public Decoration()
    {
        this.position = new Tuples.ByteXZ();
    }

    public Decoration(int rotationAndIcon, Tuples.ByteXZ position, String label, int color)
    {
        this.rotationAndIcon = rotationAndIcon;
        this.position = position;
        this.label = label;
        this.color = color;
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
