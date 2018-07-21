package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class TabComplete extends soupply.java.Packet
{

    public static final int ID = 5;

    public int transactionId;
    public String text;

    public TabComplete()
    {
    }

    public TabComplete(int transactionId, String text)
    {
        this.transactionId = transactionId;
        this.text = text;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(transactionId);
        byte[] dvd = _buffer.convertString(text);
        _buffer.writeVaruint((int)dvd.length);
        _buffer.writeBytes(dvd);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        transactionId = _buffer.readVaruint();
        final int bvdvd = _buffer.readVaruint();
        text = _buffer.readString(bvdvd);
    }

    public static TabComplete fromBuffer(byte[] buffer)
    {
        TabComplete packet = new TabComplete();
        packet.safeDecode(buffer);
        return packet;
    }

}
