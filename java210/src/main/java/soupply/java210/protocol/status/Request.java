package soupply.java210.protocol.status;

import java.util.*;
import soupply.util.*;

public class Request extends soupply.java210.Packet
{

    public static final int ID = 0;

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

    public static Request fromBuffer(byte[] buffer)
    {
        Request packet = new Request();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
