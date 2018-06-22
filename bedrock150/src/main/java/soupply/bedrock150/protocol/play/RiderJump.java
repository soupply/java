package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class RiderJump extends soupply.bedrock150.Packet
{

    public static final int ID = 20;

    public long rider;

    public RiderJump()
    {
    }

    public RiderJump(long rider)
    {
        this.rider = rider;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(rider);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        rider = _buffer.readVarlong();
    }

    public static RiderJump fromBuffer(byte[] buffer)
    {
        RiderJump packet = new RiderJump();
        packet.safeDecode(buffer);
        return packet;
    }

}
