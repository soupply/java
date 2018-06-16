package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class BookEdit extends soupply.bedrock201.Packet
{

    public static final int ID = 97;

    public byte type;
    public byte slot;

    public BookEdit()
    {
    }

    public BookEdit(byte type, byte slot)
    {
        this.type = type;
        this.slot = slot;
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
