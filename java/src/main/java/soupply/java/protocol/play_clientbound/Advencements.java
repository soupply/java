package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class Advencements extends soupply.java.Packet
{

    public static final int ID = 81;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
    }

    public static Advencements fromBuffer(byte[] buffer)
    {
        Advencements packet = new Advencements();
        packet.safeDecode(buffer);
        return packet;
    }

}
