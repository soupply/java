package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Title extends soupply.java316.Packet
{

    public static final int ID = 69;

    public int action;

    public Title()
    {
    }

    public Title(int action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVaruint();
    }

    public static Title fromBuffer(byte[] buffer)
    {
        Title packet = new Title();
        packet.safeDecode(buffer);
        return packet;
    }

}
