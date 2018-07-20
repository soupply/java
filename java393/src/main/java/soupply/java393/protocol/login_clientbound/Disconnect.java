package soupply.java393.protocol.login_clientbound;

import java.util.*;
import soupply.util.*;

public class Disconnect extends soupply.java393.Packet
{

    public static final int ID = 0;

    public String reason;

    public Disconnect()
    {
    }

    public Disconnect(String reason)
    {
        this.reason = reason;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] cvc9 = _buffer.convertString(reason);
        _buffer.writeVaruint((int)cvc9.length);
        _buffer.writeBytes(cvc9);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvcvc9 = _buffer.readVaruint();
        reason = _buffer.readString(bvcvc9);
    }

    public static Disconnect fromBuffer(byte[] buffer)
    {
        Disconnect packet = new Disconnect();
        packet.safeDecode(buffer);
        return packet;
    }

}
