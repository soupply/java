package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class InitiateWebSocketConnection extends soupply.bedrock141.Packet
{

    public static final int ID = 95;

    public String unknown0;

    public InitiateWebSocketConnection()
    {
    }

    public InitiateWebSocketConnection(String unknown0)
    {
        this.unknown0 = unknown0;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] d5b9ba = _buffer.convertString(unknown0);
        _buffer.writeVaruint((int)d5b9ba.length);
        _buffer.writeBytes(d5b9ba);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvd5b9ba = _buffer.readVaruint();
        unknown0 = _buffer.readString(bvd5b9ba);
    }

    public static InitiateWebSocketConnection fromBuffer(byte[] buffer)
    {
        InitiateWebSocketConnection packet = new InitiateWebSocketConnection();
        packet.safeDecode(buffer);
        return packet;
    }

}
