package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetEntityLink extends soupply.bedrock261.Packet
{

    public static final int ID = 41;

    // action
    public static final byte REMOVE = (byte)0;
    public static final byte ADD = (byte)1;

    public long vehicle;
    public long passenger;
    public byte action;

    public SetEntityLink()
    {
    }

    public SetEntityLink(long vehicle, long passenger, byte action)
    {
        this.vehicle = vehicle;
        this.passenger = passenger;
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(vehicle);
        _buffer.writeVarlong(passenger);
        _buffer.writeByte(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        vehicle = _buffer.readVarlong();
        passenger = _buffer.readVarlong();
        action = _buffer.readByte();
    }

    public static SetEntityLink fromBuffer(byte[] buffer)
    {
        SetEntityLink packet = new SetEntityLink();
        packet.safeDecode(buffer);
        return packet;
    }

}
