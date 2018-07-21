package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class SteerBoat extends soupply.java.Packet
{

    public static final int ID = 17;

    public boolean rightPaddleTurning;
    public boolean leftPaddleTurning;

    public SteerBoat()
    {
    }

    public SteerBoat(boolean rightPaddleTurning, boolean leftPaddleTurning)
    {
        this.rightPaddleTurning = rightPaddleTurning;
        this.leftPaddleTurning = leftPaddleTurning;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(rightPaddleTurning);
        _buffer.writeBool(leftPaddleTurning);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        rightPaddleTurning = _buffer.readBool();
        leftPaddleTurning = _buffer.readBool();
    }

    public static SteerBoat fromBuffer(byte[] buffer)
    {
        SteerBoat packet = new SteerBoat();
        packet.safeDecode(buffer);
        return packet;
    }

}
