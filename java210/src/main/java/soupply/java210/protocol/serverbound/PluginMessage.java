package soupply.java210.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class PluginMessage extends soupply.java210.Packet
{

    public static final int ID = 9;

    public String channel;
    public byte[] data;

    public PluginMessage()
    {
    }

    public PluginMessage(String channel, byte[] data)
    {
        this.channel = channel;
        this.data = data;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] yhb5b = _buffer.convertString(channel);
        _buffer.writeVaruint((int)yhb5b.length);
        _buffer.writeBytes(yhb5b);
        _buffer.writeBytes(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvyhb5b = _buffer.readVaruint();
        channel = _buffer.readString(bvyhb5b);
        data = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static PluginMessage fromBuffer(byte[] buffer)
    {
        PluginMessage packet = new PluginMessage();
        packet.safeDecode(buffer);
        return packet;
    }

}
