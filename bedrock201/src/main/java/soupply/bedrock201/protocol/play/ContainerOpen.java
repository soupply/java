package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class ContainerOpen extends soupply.bedrock201.Packet
{

    public static final int ID = 46;

    public byte window;
    public byte type;
    public soupply.bedrock201.type.BlockPosition position;
    public long entityId;

    public ContainerOpen()
    {
        this.position = new soupply.bedrock201.type.BlockPosition();
    }

    public ContainerOpen(byte window, byte type, soupply.bedrock201.type.BlockPosition position, long entityId)
    {
        this.window = window;
        this.type = type;
        this.position = position;
        this.entityId = entityId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianByte(window);
        _buffer.writeLittleEndianByte(type);
        position.encodeBody(_buffer);
        _buffer.writeVarlong(entityId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readLittleEndianByte();
        type = _buffer.readLittleEndianByte();
        position.decodeBody(_buffer);
        entityId = _buffer.readVarlong();
    }

    public static ContainerOpen fromBuffer(byte[] buffer)
    {
        ContainerOpen packet = new ContainerOpen();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
