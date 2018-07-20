package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class SpawnPainting extends soupply.java393.Packet
{

    public static final int ID = 4;

    // motive
    public static final int KEBAB = (int)0;
    public static final int AZTEC = (int)1;
    public static final int ALBAN = (int)2;
    public static final int AZTEC2 = (int)3;
    public static final int BOMB = (int)4;
    public static final int PLANT = (int)5;
    public static final int WASTELAND = (int)6;
    public static final int POOL = (int)7;
    public static final int COURBET = (int)8;
    public static final int SEA = (int)9;
    public static final int SUNSET = (int)10;
    public static final int CREEBET = (int)11;
    public static final int WANDERER = (int)12;
    public static final int GRAHAM = (int)13;
    public static final int MATCH = (int)14;
    public static final int BUST = (int)15;
    public static final int STAGE = (int)16;
    public static final int VOID = (int)17;
    public static final int SULL_AND_ROSES = (int)18;
    public static final int WITHER = (int)19;
    public static final int FIGHTERS = (int)20;
    public static final int POINTER = (int)21;
    public static final int PIGSCENE = (int)22;
    public static final int BURNING_SKULL = (int)23;
    public static final int SKELETON = (int)24;
    public static final int DONKEY_KONG = (int)25;

    // direction
    public static final byte SOUTH = (byte)0;
    public static final byte WEST = (byte)1;
    public static final byte NORTH = (byte)2;
    public static final byte EAST = (byte)3;

    public int entityId;
    public UUID uuid;
    public int motive;
    public long position;
    public byte direction;

    public SpawnPainting()
    {
        this.uuid = new UUID(0, 0);
    }

    public SpawnPainting(int entityId, UUID uuid, int motive, long position, byte direction)
    {
        this.entityId = entityId;
        this.uuid = uuid;
        this.motive = motive;
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
        _buffer.writeVaruint(motive);
        _buffer.writeBigEndianLong(position);
        _buffer.writeByte(direction);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        uuid = _buffer.readUUID();
        motive = _buffer.readVaruint();
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
