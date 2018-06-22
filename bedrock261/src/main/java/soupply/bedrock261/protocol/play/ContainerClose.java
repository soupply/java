package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ContainerClose extends soupply.bedrock261.Packet
{

    public static final int ID = 47;

    public byte window;

    public ContainerClose()
    {
    }

    public ContainerClose(byte window)
    {
        this.window = window;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
    }

    public static ContainerClose fromBuffer(byte[] buffer)
    {
        ContainerClose packet = new ContainerClose();
        packet.safeDecode(buffer);
        return packet;
    }

}
