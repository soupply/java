package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddPainting extends soupply.bedrock137.Packet
{

    public static final int ID = 22;

    public long entityId;
    public long runtimeId;
    public soupply.bedrock137.type.BlockPosition position;
    public int direction;
    public String title;

    public AddPainting()
    {
        this.position = new soupply.bedrock137.type.BlockPosition();
    }

    public AddPainting(long entityId, long runtimeId, soupply.bedrock137.type.BlockPosition position, int direction, String title)
    {
        this.entityId = entityId;
        this.runtimeId = runtimeId;
        this.position = position;
        this.direction = direction;
        this.title = title;
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
        _buffer.writeVarulong(runtimeId);
        position.encodeBody(_buffer);
        _buffer.writeVarint(direction);
        byte[] dlbu = _buffer.convertString(title);
        _buffer.writeVaruint((int)dlbu.length);
        _buffer.writeBytes(dlbu);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        runtimeId = _buffer.readVarulong();
        position.decodeBody(_buffer);
        direction = _buffer.readVarint();
        final int bvdlbu = _buffer.readVaruint();
        title = _buffer.readString(bvdlbu);
    }

    public static AddPainting fromBuffer(byte[] buffer)
    {
        AddPainting packet = new AddPainting();
        packet.safeDecode(buffer);
        return packet;
    }

}
