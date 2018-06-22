package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPainting extends soupply.java335.Packet
{

    public static final int ID = 4;

    // direction
    public static final byte SOUTH = (byte)0;
    public static final byte WEST = (byte)1;
    public static final byte NORTH = (byte)2;
    public static final byte EAST = (byte)3;

    public int entityId;
    public UUID uuid;
    public String title;
    public long position;
    public byte direction;

    public SpawnPainting()
    {
        this.uuid = new UUID(0, 0);
    }

    public SpawnPainting(int entityId, UUID uuid, String title, long position, byte direction)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.title = title;
        this.position = position;
        this.direction = direction;
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
        _buffer.writeUUID(uuid);
        byte[] dlbu = _buffer.convertString(title);
        _buffer.writeVaruint((int)dlbu.length);
        _buffer.writeBytes(dlbu);
        _buffer.writeBigEndianLong(position);
        _buffer.writeByte(direction);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        uuid = _buffer.readUUID();
        final int bvdlbu = _buffer.readVaruint();
        title = _buffer.readString(bvdlbu);
        position = _buffer.readBigEndianLong();
        direction = _buffer.readByte();
    }

    public static SpawnPainting fromBuffer(byte[] buffer)
    {
        SpawnPainting packet = new SpawnPainting();
        packet.safeDecode(buffer);
        return packet;
    }

}
