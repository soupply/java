package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class MultiBlockChange extends soupply.java340.Packet
{

    public static final int ID = 16;

    public IntXZ chunk;
    public soupply.java340.type.BlockChange[] changes;

    public MultiBlockChange()
    {
        this.chunk = new IntXZ();
    }

    public MultiBlockChange(IntXZ chunk, soupply.java340.type.BlockChange[] changes)
    {
        this.chunk = chunk;
        this.changes = changes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(chunk.x);
        _buffer.writeBigEndianInt(chunk.z);
        _buffer.writeVaruint((int)changes.length);
        for(soupply.java340.type.BlockChange yhbdc:changes)
        {
            yhbdc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        chunk.x = _buffer.readBigEndianInt();
        chunk.z = _buffer.readBigEndianInt();
        final int bny5zm = _buffer.readVaruint();
        changes = new soupply.java340.type.BlockChange[bny5zm];
        for(int yhbdc=0;yhbdc<changes.length;yhbdc++)
        {
            changes[yhbdc].decodeBody(_buffer);
        }
    }

    public static MultiBlockChange fromBuffer(byte[] buffer)
    {
        MultiBlockChange packet = new MultiBlockChange();
        packet.safeDecode(buffer);
        return packet;
    }

}
