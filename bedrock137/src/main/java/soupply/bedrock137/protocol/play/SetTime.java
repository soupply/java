package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetTime extends soupply.bedrock137.Packet
{

    public static final int ID = 10;

    public int time;

    public SetTime()
    {
    }

    public SetTime(int time)
    {
        this.time = time;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(time);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        time = _buffer.readVarint();
    }

    public static SetTime fromBuffer(byte[] buffer)
    {
        SetTime packet = new SetTime();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
