package soupply.java.protocol.login;

import java.util.*;
import soupply.util.*;

public class Disconnect extends soupply.java.Packet
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
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
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
