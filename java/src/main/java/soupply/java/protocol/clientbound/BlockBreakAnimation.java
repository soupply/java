package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class BlockBreakAnimation extends soupply.java.Packet
{

    public static final int ID = 8;

    public int entityId;
    public long position;
    public byte stage;

    public BlockBreakAnimation()
    {
    }

    public BlockBreakAnimation(int entityId, long position, byte stage)
    {
        this.entityId = entityId;
        this.position = position;
        this.stage = stage;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeBigEndianLong(position);
        _buffer.writeByte(stage);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        position = _buffer.readBigEndianLong();
        stage = _buffer.readByte();
    }

    public static BlockBreakAnimation fromBuffer(byte[] buffer)
    {
        BlockBreakAnimation packet = new BlockBreakAnimation();
        packet.safeDecode(buffer);
        return packet;
    }

}
