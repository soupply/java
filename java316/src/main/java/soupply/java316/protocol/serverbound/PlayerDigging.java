package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerDigging extends soupply.java316.Packet
{

    public static final int ID = 19;

    // status
    public static final int START_DIGGING = (int)0;
    public static final int CANCEL_DIGGING = (int)1;
    public static final int FINISH_DIGGING = (int)2;
    public static final int DROP_ITEM_STACK = (int)3;
    public static final int DROP_ITEM = (int)4;
    public static final int SHOOT_ARROW = (int)5;
    public static final int FINISH_EATING = (int)5;
    public static final int SWAP_ITEM_IN_HAND = (int)6;

    public int status;
    public long position;
    public byte face;

    public PlayerDigging()
    {
    }

    public PlayerDigging(int status, long position, byte face)
    {
        this.status = status;
        this.position = position;
        this.face = face;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(status);
        _buffer.writeBigEndianLong(position);
        _buffer.writeByte(face);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        status = _buffer.readVaruint();
        position = _buffer.readBigEndianLong();
        face = _buffer.readByte();
    }

    public static PlayerDigging fromBuffer(byte[] buffer)
    {
        PlayerDigging packet = new PlayerDigging();
        packet.safeDecode(buffer);
        return packet;
    }

}
