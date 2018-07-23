package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class OptionalChat extends Type
{

    public boolean hasChat;
    public String chat;

    public OptionalChat()
    {
    }

    public OptionalChat(boolean hasChat, String chat)
    {
        this.hasChat = hasChat;
        this.chat = chat;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(hasChat);
        if(hasChat==true)
        {
            byte[] yhd = _buffer.convertString(chat);
            _buffer.writeVaruint((int)yhd.length);
            _buffer.writeBytes(yhd);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        hasChat = _buffer.readBool();
        if(hasChat==true)
        {
            final int bvyhd = _buffer.readVaruint();
            chat = _buffer.readString(bvyhd);
        }
    }

}
