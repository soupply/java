package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PlayerBlockPlacement extends soupply.java210.Packet
{

    public static final int ID = 28;

    // hand
    public static final int MAIN_HAND = (int)0;
    public static final int OFF_HAND = (int)1;

    public long position;
    public int face;
    public int hand;
    public ByteXYZ cursorPosition;

    public PlayerBlockPlacement()
    {
        this.cursorPosition = new ByteXYZ();
    }

    public PlayerBlockPlacement(long position, int face, int hand, ByteXYZ cursorPosition)
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
        _buffer.writeByte(cursorPosition.x);
        _buffer.writeByte(cursorPosition.y);
        _buffer.writeByte(cursorPosition.z);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readBigEndianLong();
        face = _buffer.readVaruint();
        hand = _buffer.readVaruint();
        cursorPosition.x = _buffer.readByte();
        cursorPosition.y = _buffer.readByte();
        cursorPosition.z = _buffer.readByte();
    }

    public static PlayerBlockPlacement fromBuffer(byte[] buffer)
    {
        PlayerBlockPlacement packet = new PlayerBlockPlacement();
        packet.safeDecode(buffer);
        return packet;
    }

}
