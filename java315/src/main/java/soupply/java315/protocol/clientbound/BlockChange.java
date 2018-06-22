package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class BlockChange extends soupply.java315.Packet
{

    public static final int ID = 11;

    public long position;
    public int block;

    public BlockChange()
    {
    }

    public BlockChange(long position, int block)
    {
        this.position = position;
        this.block = block;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(position);
        _buffer.writeVaruint(block);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readBigEndianLong();
        block = _buffer.readVaruint();
    }

    public static BlockChange fromBuffer(byte[] buffer)
    {
        BlockChange packet = new BlockChange();
        packet.safeDecode(buffer);
        return packet;
    }

}
