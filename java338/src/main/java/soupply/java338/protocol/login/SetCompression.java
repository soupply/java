package soupply.java338.protocol.login;

import java.util.*;
import soupply.util.*;

public class SetCompression extends soupply.java338.Packet
{

    public static final int ID = 3;

    public int thresold;

    public SetCompression()
    {
    }

    public SetCompression(int thresold)
    {
        this.thresold = thresold;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(thresold);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        thresold = _buffer.readVaruint();
    }

    public static SetCompression fromBuffer(byte[] buffer)
    {
        SetCompression packet = new SetCompression();
        packet.safeDecode(buffer);
        return packet;
    }

}
