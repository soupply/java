package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class FacePlayer extends soupply.java.Packet
{

    public static final int ID = 49;

    // type
    public static final int FEET = (int)0;
    public static final int EYES = (int)1;

    public int type;
    public DoubleXYZ target;
    public boolean isEntity;
    public int entityId;
    public int entityType;

    public FacePlayer()
    {
        this.target = new DoubleXYZ();
    }

    public FacePlayer(int type, DoubleXYZ target, boolean isEntity, int entityId, int entityType)
    {
        this.type = type;
        this.target = target;
        this.isEntity = isEntity;
        this.entityId = entityId;
        this.entityType = entityType;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
        _buffer.writeBigEndianDouble(target.x);
        _buffer.writeBigEndianDouble(target.y);
        _buffer.writeBigEndianDouble(target.z);
        _buffer.writeBool(isEntity);
        if(isEntity==true)
        {
            _buffer.writeVaruint(entityId);
            _buffer.writeVaruint(entityType);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        type = _buffer.readVaruint();
        target.x = _buffer.readBigEndianDouble();
        target.y = _buffer.readBigEndianDouble();
        target.z = _buffer.readBigEndianDouble();
        isEntity = _buffer.readBool();
        if(isEntity==true)
        {
            entityId = _buffer.readVaruint();
            entityType = _buffer.readVaruint();
        }
    }

    public static FacePlayer fromBuffer(byte[] buffer)
    {
        FacePlayer packet = new FacePlayer();
        packet.safeDecode(buffer);
        return packet;
    }

}
