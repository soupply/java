package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class ClientToServerHandshake extends soupply.bedrock.Packet
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
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
