package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ContainerClose extends soupply.bedrock150.Packet
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
        _buffer.writeLittleEndianByte(window);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readLittleEndianByte();
    }

    public static ContainerClose fromBuffer(byte[] buffer)
    {
        ContainerClose packet = new ContainerClose();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
