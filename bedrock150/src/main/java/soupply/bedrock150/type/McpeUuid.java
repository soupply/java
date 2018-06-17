package soupply.bedrock150.type;

import java.util.*;
import soupply.util.*;

public class McpeUuid extends Type
{

    public long mostSignificantBits;
    public long leastSignificantBits;

    public McpeUuid()
    {
    }

    public McpeUuid(long mostSignificantBits, long leastSignificantBits)
    {
        this.mostSignificantBits = mostSignificantBits;
        this.leastSignificantBits = leastSignificantBits;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianLong(mostSignificantBits);
        _buffer.writeLittleEndianLong(leastSignificantBits);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        mostSignificantBits = _buffer.readLittleEndianLong();
        leastSignificantBits = _buffer.readLittleEndianLong();
    }

}
