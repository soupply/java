package soupply.java316.serverbound;

import java.util.*;
import soupply.util.*;

class ChatMessage extends soupply.java316.Packet
{

    public String text;

    public ChatMessage()
    {
    }

    public ChatMessage(String text)
    {
        this.text = text;
    }

}
