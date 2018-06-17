package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class NpcRequest extends soupply.bedrock.Packet
{

    public static final int ID = 98;

    public long entityId;
    public byte requestType;
    public String command;
    public byte actionType;

    public NpcRequest()
    {
    }

    public NpcRequest(long entityId, byte requestType, String command, byte actionType)
    {
        this.entityId = entityId;
        this.requestType = requestType;
        this.command = command;
        this.actionType = actionType;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeLittleEndianByte(requestType);
        byte[] y9bfz = _buffer.convertString(command);
        _buffer.writeVaruint((int)y9bfz.length);
        _buffer.writeBytes(y9bfz);
        _buffer.writeLittleEndianByte(actionType);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        requestType = _buffer.readLittleEndianByte();
        final int bvy9bfz = _buffer.readVaruint();
        command = _buffer.readString(bvy9bfz);
        actionType = _buffer.readLittleEndianByte();
    }

    public static NpcRequest fromBuffer(byte[] buffer)
    {
        NpcRequest packet = new NpcRequest();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
