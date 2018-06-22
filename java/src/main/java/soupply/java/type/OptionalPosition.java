package soupply.java.type;

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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(hasPosition);
        if(hasPosition==true)
        {
            _buffer.writeBigEndianLong(position);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        hasPosition = _buffer.readBool();
        if(hasPosition==true)
        {
            position = _buffer.readBigEndianLong();
        }
    }

}
