package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class Animation extends soupply.java340.Packet
{

    public static final int ID = 29;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public int hand;

    public Animation()
    {
    }

    public Animation(int hand)
    {
        this.hand = hand;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(hand);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        hand = _buffer.readVaruint();
    }

    public static Animation fromBuffer(byte[] buffer)
    {
        Animation packet = new Animation();
        packet.safeDecode(buffer);
        return packet;
    }

}
