package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class BlockPickRequest extends soupply.bedrock160.Packet
{

    public static final int ID = 34;

    public IntXYZ position;
    public boolean unknown1;
    public byte slot;

    public BlockPickRequest()
    {
        this.position = new IntXYZ();
    }

    public BlockPickRequest(IntXYZ position, boolean unknown1, byte slot)
    {
        this.position = position;
        this.unknown1 = unknown1;
        this.slot = slot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(position.x);
        _buffer.writeVarint(position.y);
        _buffer.writeVarint(position.z);
        _buffer.writeBool(unknown1);
        _buffer.writeByte(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readVarint();
        position.y = _buffer.readVarint();
        position.z = _buffer.readVarint();
        unknown1 = _buffer.readBool();
        slot = _buffer.readByte();
    }

    public static BlockPickRequest fromBuffer(byte[] buffer)
    {
        BlockPickRequest packet = new BlockPickRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
