package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerBlockPlacement extends soupply.java338.Packet
{

    public static final int ID = 31;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public long position;
    public int face;
    public int hand;
    public FloatXYZ cursorPosition;

    public PlayerBlockPlacement()
    {
        this.cursorPosition = new FloatXYZ();
    }

    public PlayerBlockPlacement(long position, int face, int hand, FloatXYZ cursorPosition)
    {
        this.position = position;
        this.face = face;
        this.hand = hand;
        this.cursorPosition = cursorPosition;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(position);
        _buffer.writeVaruint(face);
        _buffer.writeVaruint(hand);
        _buffer.writeBigEndianFloat(cursorPosition.x);
        _buffer.writeBigEndianFloat(cursorPosition.y);
        _buffer.writeBigEndianFloat(cursorPosition.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readBigEndianLong();
        face = _buffer.readVaruint();
        hand = _buffer.readVaruint();
        cursorPosition.x = _buffer.readBigEndianFloat();
        cursorPosition.y = _buffer.readBigEndianFloat();
        cursorPosition.z = _buffer.readBigEndianFloat();
    }

    public static PlayerBlockPlacement fromBuffer(byte[] buffer)
    {
        PlayerBlockPlacement packet = new PlayerBlockPlacement();
        packet.safeDecode(buffer);
        return packet;
    }

}
