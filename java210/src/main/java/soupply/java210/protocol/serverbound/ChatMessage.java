package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ChatMessage extends soupply.java210.Packet
{

    public static final int ID = 2;

    public String text;

    public ChatMessage()
    {
    }

    public ChatMessage(String text)
    {
        this.text = text;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] dvd = _buffer.convertString(text);
        _buffer.writeVaruint((int)dvd.length);
        _buffer.writeBytes(dvd);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvdvd = _buffer.readVaruint();
        text = _buffer.readString(bvdvd);
    }

    public static ChatMessage fromBuffer(byte[] buffer)
    {
        ChatMessage packet = new ChatMessage();
        packet.safeDecode(buffer);
        return packet;
    }

}
