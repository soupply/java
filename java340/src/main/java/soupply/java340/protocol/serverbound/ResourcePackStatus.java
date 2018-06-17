package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ResourcePackStatus extends soupply.java340.Packet
{

    public static final int ID = 24;

    // result
    public static final int LOADED = (int)0;
    public static final int DECLINED = (int)1;
    public static final int FAILED = (int)2;
    public static final int ACCEPTED = (int)3;

    public int result;

    public ResourcePackStatus()
    {
    }

    public ResourcePackStatus(int result)
    {
        this.result = result;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(result);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        result = _buffer.readVaruint();
    }

    public static ResourcePackStatus fromBuffer(byte[] buffer)
    {
        ResourcePackStatus packet = new ResourcePackStatus();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
