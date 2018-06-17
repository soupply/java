package soupply.java315.protocol.status;

import java.util.*;
import soupply.util.*;

public class Response extends soupply.java315.Packet
{

    public static final int ID = 0;

    public String json;

    public Response()
    {
    }

    public Response(String json)
    {
        this.json = json;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] anb = _buffer.convertString(json);
        _buffer.writeVaruint((int)anb.length);
        _buffer.writeBytes(anb);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvanb = _buffer.readVaruint();
        json = _buffer.readString(bvanb);
    }

    public static Response fromBuffer(byte[] buffer)
    {
        Response packet = new Response();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
