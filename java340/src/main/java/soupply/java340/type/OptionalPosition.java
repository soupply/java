package soupply.java340.type;

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
        _buffer.writeBigEndianLong(position);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        hasPosition = _buffer.readBool();
        position = _buffer.readBigEndianLong();
    }

}
