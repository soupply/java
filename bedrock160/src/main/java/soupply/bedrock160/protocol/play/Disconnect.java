package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class Disconnect extends soupply.bedrock160.Packet
{

    public static final int ID = 5;

    public boolean hideDisconnectionScreen;
    public String message;

    public Disconnect()
    {
    }

    public Disconnect(boolean hideDisconnectionScreen, String message)
    {
        this.hideDisconnectionScreen = hideDisconnectionScreen;
        this.message = message;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(hideDisconnectionScreen);
        byte[] bvcfz = _buffer.convertString(message);
        _buffer.writeVaruint((int)bvcfz.length);
        _buffer.writeBytes(bvcfz);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        hideDisconnectionScreen = _buffer.readBool();
        final int bvbvcfz = _buffer.readVaruint();
        message = _buffer.readString(bvbvcfz);
    }

    public static Disconnect fromBuffer(byte[] buffer)
    {
        Disconnect packet = new Disconnect();
        packet.safeDecode(buffer);
        return packet;
    }

}
