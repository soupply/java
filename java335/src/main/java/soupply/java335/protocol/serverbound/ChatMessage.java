package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ChatMessage extends soupply.java335.Packet
{

    public static final int ID = 3;

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
    public void decodeBody(Buffer buffer)
    {
    }

}
