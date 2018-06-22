package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ChatMessage extends soupply.java210.Packet
{

    public static final int ID = 15;

    // position
    public static final byte CHAT = (byte)0;
    public static final byte SYSTEM_MESSAGE = (byte)1;
    public static final byte ABOVE_HOTBAR = (byte)2;

    public String message;
    public byte position;

    public ChatMessage()
    {
    }

    public ChatMessage(String message, byte position)
    {
        this.message = message;
        this.position = position;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bvcfz = _buffer.convertString(message);
        _buffer.writeVaruint((int)bvcfz.length);
        _buffer.writeBytes(bvcfz);
        _buffer.writeByte(position);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbvcfz = _buffer.readVaruint();
        message = _buffer.readString(bvbvcfz);
        position = _buffer.readByte();
    }

    public static ChatMessage fromBuffer(byte[] buffer)
    {
        ChatMessage packet = new ChatMessage();
        packet.safeDecode(buffer);
        return packet;
    }

}
