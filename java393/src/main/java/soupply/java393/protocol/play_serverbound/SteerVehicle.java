package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class SteerVehicle extends soupply.java393.Packet
{

    public static final int ID = 22;

    // flags
    public static final byte JUMP = (byte)1;
    public static final byte UNMOUNT = (byte)2;

    public float sideways;
    public float forward;
    public byte flags;

    public SteerVehicle()
    {
    }

    public SteerVehicle(float sideways, float forward, byte flags)
    {
        this.sideways = sideways;
        this.forward = forward;
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
        _buffer.writeBigEndianFloat(sideways);
        _buffer.writeBigEndianFloat(forward);
        _buffer.writeByte(flags);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        sideways = _buffer.readBigEndianFloat();
        forward = _buffer.readBigEndianFloat();
        flags = _buffer.readByte();
    }

    public static SteerVehicle fromBuffer(byte[] buffer)
    {
        SteerVehicle packet = new SteerVehicle();
        packet.safeDecode(buffer);
        return packet;
    }

}
