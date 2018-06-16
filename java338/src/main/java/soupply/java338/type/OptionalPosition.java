package soupply.java338.type;

import java.util.*;
import soupply.util.*;

public class OptionalPosition extends Type
{

    public boolean hasPosition;
    public long position;

    public OptionalPosition()
    {
    }

    public OptionalPosition(boolean hasPosition, long position)
    {
        this.hasPosition = hasPosition;
        this.position = position;
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
