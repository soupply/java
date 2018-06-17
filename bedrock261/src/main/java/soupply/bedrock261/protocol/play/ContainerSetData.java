package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ContainerSetData extends soupply.bedrock261.Packet
{

    public static final int ID = 51;

    public byte window;
    public int property;
    public int value;

    public ContainerSetData()
    {
    }

    public ContainerSetData(byte window, int property, int value)
    {
        this.window = window;
        this.property = property;
        this.value = value;
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
        _buffer.writeVarint(property);
        _buffer.writeVarint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readLittleEndianByte();
        property = _buffer.readVarint();
        value = _buffer.readVarint();
    }

    public static ContainerSetData fromBuffer(byte[] buffer)
    {
        ContainerSetData packet = new ContainerSetData();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
