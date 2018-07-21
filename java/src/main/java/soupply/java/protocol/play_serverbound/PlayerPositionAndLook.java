package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerPositionAndLook extends soupply.java.Packet
{

    public static final int ID = 17;

    public DoubleXYZ position;
    public float yaw;
    public float pitch;
    public boolean onGround;

    public PlayerPositionAndLook()
    {
        this.position = new DoubleXYZ();
    }

    public PlayerPositionAndLook(DoubleXYZ position, float yaw, float pitch, boolean onGround)
    {
        this.position = position;
        this.yaw = yaw;
        this.pitch = pitch;
        this.onGround = onGround;
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
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        yaw = _buffer.readBigEndianFloat();
        pitch = _buffer.readBigEndianFloat();
        onGround = _buffer.readBool();
    }

    public static PlayerPositionAndLook fromBuffer(byte[] buffer)
    {
        PlayerPositionAndLook packet = new PlayerPositionAndLook();
        packet.safeDecode(buffer);
        return packet;
    }

}
