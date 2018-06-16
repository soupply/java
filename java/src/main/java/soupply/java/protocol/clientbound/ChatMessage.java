package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class ChatMessage extends soupply.java.Packet
{

    public static final int ID = 15;

    // position
    public static final byte CHAT = 0;
    public static final byte SYSTEM_MESSAGE = 1;
    public static final byte ABOVE_HOTBAR = 2;

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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
