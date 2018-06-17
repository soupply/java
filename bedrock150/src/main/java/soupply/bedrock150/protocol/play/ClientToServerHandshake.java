package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ClientToServerHandshake extends soupply.bedrock150.Packet
{

    public static final int ID = 4;

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

    public static ClientToServerHandshake fromBuffer(byte[] buffer)
    {
        ClientToServerHandshake packet = new ClientToServerHandshake();
        packet.safeDecode(buffer);
        return packet;
    }

}
