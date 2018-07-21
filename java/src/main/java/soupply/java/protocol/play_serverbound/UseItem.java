package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class UseItem extends soupply.java.Packet
{

    public static final int ID = 32;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public int hand;

    public UseItem()
    {
    }

    public UseItem(int hand)
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
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        hand = _buffer.readVaruint();
    }

    public static UseItem fromBuffer(byte[] buffer)
    {
        UseItem packet = new UseItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
