package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class Link extends Type
{

    // action
    public static final byte ADD = (byte)0;
    public static final byte RIDE = (byte)1;
    public static final byte REMOVE = (byte)2;

    public long from;
    public long to;
    public byte action;
    public byte unknown3;

    public Link()
    {
    }

    public Link(long from, long to, byte action, byte unknown3)
    {
        this.from = from;
        this.to = to;
        this.action = action;
        this.unknown3 = unknown3;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(from);
        _buffer.writeVarlong(to);
        _buffer.writeLittleEndianByte(action);
        _buffer.writeLittleEndianByte(unknown3);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        from = _buffer.readVarlong();
        to = _buffer.readVarlong();
        action = _buffer.readLittleEndianByte();
        unknown3 = _buffer.readLittleEndianByte();
    }

}
