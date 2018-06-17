package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class RiderJump extends soupply.bedrock160.Packet
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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        rider = _buffer.readVarlong();
    }

    public static RiderJump fromBuffer(byte[] buffer)
    {
        RiderJump packet = new RiderJump();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
