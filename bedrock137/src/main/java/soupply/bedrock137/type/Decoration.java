package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

public class Decoration extends Type
{

    public int rotationAndIcon;
    public ByteXZ position;
    public String label;
    public int color;

    public Decoration()
    {
        this.position = new ByteXZ();
    }

    public Decoration(int rotationAndIcon, ByteXZ position, String label, int color)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
