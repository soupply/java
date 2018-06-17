package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerPosition extends soupply.java338.Packet
{

    public static final int ID = 13;

    public DoubleXYZ position;
    public boolean onGround;

    public PlayerPosition()
    {
        this.position = new DoubleXYZ();
    }

    public PlayerPosition(DoubleXYZ position, boolean onGround)
    {
        this.position = position;
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
        _buffer.writeBool(onGround);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        position.x = _buffer.readBigEndianDouble();
        position.y = _buffer.readBigEndianDouble();
        position.z = _buffer.readBigEndianDouble();
        onGround = _buffer.readBool();
    }

    public static PlayerPosition fromBuffer(byte[] buffer)
    {
        PlayerPosition packet = new PlayerPosition();
        packet.safeDecode(buffer);
        return packet;
    }

}
