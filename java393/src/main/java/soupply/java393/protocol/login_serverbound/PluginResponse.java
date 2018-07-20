package soupply.java393.protocol.login_serverbound;

import java.util.*;
import soupply.util.*;

public class PluginResponse extends soupply.java393.Packet
{

    public static final int ID = 2;

    public int messageId;
    public boolean successful;
    public byte[] data;

    public PluginResponse()
    {
    }

    public PluginResponse(int messageId, boolean successful, byte[] data)
    {
        this.messageId = messageId;
        this.successful = successful;
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
        _buffer.writeBool(successful);
        if(successful==true)
        {
            _buffer.writeBytes(data);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        messageId = _buffer.readVaruint();
        successful = _buffer.readBool();
        if(successful==true)
        {
            data = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
        }
    }

    public static PluginResponse fromBuffer(byte[] buffer)
    {
        PluginResponse packet = new PluginResponse();
        packet.safeDecode(buffer);
        return packet;
    }

}
