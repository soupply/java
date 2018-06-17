package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Advencements extends soupply.java340.Packet
{

    public static final int ID = 77;

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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
    }

    public static Advencements fromBuffer(byte[] buffer)
    {
        Advencements packet = new Advencements();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
