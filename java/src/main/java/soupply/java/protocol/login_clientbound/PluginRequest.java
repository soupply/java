package soupply.java.protocol.login_clientbound;

import java.util.*;
import soupply.util.*;

public class PluginRequest extends soupply.java.Packet
{

    public static final int ID = 4;

    public int messageId;
    public String channel;
    public byte[] data;

    public PluginRequest()
    {
    }

    public PluginRequest(int messageId, String channel, byte[] data)
    {
        this.messageId = messageId;
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
        _buffer.writeVaruint(messageId);
        byte[] yhb5b = _buffer.convertString(channel);
        _buffer.writeVaruint((int)yhb5b.length);
        _buffer.writeBytes(yhb5b);
        _buffer.writeBytes(data);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        messageId = _buffer.readVaruint();
        final int bvyhb5b = _buffer.readVaruint();
        channel = _buffer.readString(bvyhb5b);
        data = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static PluginRequest fromBuffer(byte[] buffer)
    {
        PluginRequest packet = new PluginRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
