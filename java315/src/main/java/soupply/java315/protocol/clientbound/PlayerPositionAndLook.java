package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class PlayerPositionAndLook extends soupply.java315.Packet
{

    public static final int ID = 46;

    // flags
    public static final byte X = (byte)1;
    public static final byte Y = (byte)2;
    public static final byte Z = (byte)4;
    public static final byte Y_ROTATION = (byte)8;
    public static final byte X_ROTATION = (byte)16;

    public DoubleXYZ position;
    public float yaw;
    public float pitch;
    public byte flags;
    public int teleportId;

    public PlayerPositionAndLook()
    {
        this.position = new DoubleXYZ();
    }

    public PlayerPositionAndLook(DoubleXYZ position, float yaw, float pitch, byte flags, int teleportId)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.flags = flags;
        this.teleportId = teleportId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianDouble(position.x);
        _buffer.writeBigEndianDouble(position.y);
        _buffer.writeBigEndianDouble(position.z);
        _buffer.writeBigEndianFloat(yaw);
        _buffer.writeBigEndianFloat(pitch);
        _buffer.writeByte(flags);
        _buffer.writeVaruint(teleportId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        yaw = _buffer.readBigEndianFloat();
        pitch = _buffer.readBigEndianFloat();
        flags = _buffer.readByte();
        teleportId = _buffer.readVaruint();
    }

    public static PlayerPositionAndLook fromBuffer(byte[] buffer)
    {
        PlayerPositionAndLook packet = new PlayerPositionAndLook();
        packet.safeDecode(buffer);
        return packet;
    }

}
