package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ChatMessage extends soupply.java316.Packet
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
