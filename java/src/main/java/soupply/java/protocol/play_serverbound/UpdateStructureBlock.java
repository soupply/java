package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class UpdateStructureBlock extends soupply.java.Packet
{

    public static final int ID = 37;

    // action
    public static final int UPDATE_DATA = (int)0;
    public static final int SAVE_STRUCTURE = (int)1;
    public static final int LOAD_STRUCTURE = (int)2;
    public static final int DETECT_SIZE = (int)3;

    // mode
    public static final int SAVE = (int)0;
    public static final int LOAD = (int)1;
    public static final int CORNER = (int)2;
    public static final int DATA = (int)3;

    // mirror
    public static final int NONE = (int)0;
    public static final int LEFT_RIGHT = (int)1;
    public static final int FRONT_BACK = (int)2;

    // rotation
    public static final int CLOCKWISE_90 = (int)1;
    public static final int CLOCKWISE_180 = (int)2;
    public static final int COUNTERCLOCKWISE_90 = (int)3;

    // flags
    public static final byte IGNORE_ENTITIES = (byte)1;
    public static final byte SHOW_AIR = (byte)2;
    public static final byte SHOW_BOUNDING_BOX = (byte)4;

    public soupply.java.type.Position location;
    public int action;
    public int mode;
    public ByteXYZ offset;
    public ByteXYZ size;
    public int mirror;
    public int rotation;
    public String metadata;
    public float integrity;
    public long speed;
    public byte flags;

    public UpdateStructureBlock()
    {
        this.location = new soupply.java.type.Position();
        this.offset = new ByteXYZ();
        this.size = new ByteXYZ();
    }

    public UpdateStructureBlock(soupply.java.type.Position location, int action, int mode, ByteXYZ offset, ByteXYZ size, int mirror, int rotation, String metadata, float integrity, long speed, byte flags)
    {
        this.location = location;
        this.action = action;
        this.mode = mode;
        this.offset = offset;
        this.size = size;
        this.mirror = mirror;
        this.rotation = rotation;
        this.metadata = metadata;
        this.integrity = integrity;
        this.speed = speed;
        this.flags = flags;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        location.encodeBody(_buffer);
        _buffer.writeVaruint(action);
        _buffer.writeVaruint(mode);
        _buffer.writeByte(offset.x);
        _buffer.writeByte(offset.y);
        _buffer.writeByte(offset.z);
        _buffer.writeByte(size.x);
        _buffer.writeByte(size.y);
        _buffer.writeByte(size.z);
        _buffer.writeVaruint(mirror);
        _buffer.writeVaruint(rotation);
        byte[] bvyrde = _buffer.convertString(metadata);
        _buffer.writeVaruint((int)bvyrde.length);
        _buffer.writeBytes(bvyrde);
        _buffer.writeBigEndianFloat(integrity);
        _buffer.writeVarulong(speed);
        _buffer.writeByte(flags);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        location.decodeBody(_buffer);
        action = _buffer.readVaruint();
        mode = _buffer.readVaruint();
        offset.x = _buffer.readByte();
        offset.y = _buffer.readByte();
        offset.z = _buffer.readByte();
        size.x = _buffer.readByte();
        size.y = _buffer.readByte();
        size.z = _buffer.readByte();
        mirror = _buffer.readVaruint();
        rotation = _buffer.readVaruint();
        final int bvbvyrde = _buffer.readVaruint();
        metadata = _buffer.readString(bvbvyrde);
        integrity = _buffer.readBigEndianFloat();
        speed = _buffer.readVarulong();
        flags = _buffer.readByte();
    }

    public static UpdateStructureBlock fromBuffer(byte[] buffer)
    {
        UpdateStructureBlock packet = new UpdateStructureBlock();
        packet.safeDecode(buffer);
        return packet;
    }

}
