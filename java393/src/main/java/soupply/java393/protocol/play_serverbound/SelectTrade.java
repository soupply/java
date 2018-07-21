package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class SelectTrade extends soupply.java393.Packet
{

    public static final int ID = 31;

    public int selectedSlot;

    public SelectTrade()
    {
    }

    public SelectTrade(int selectedSlot)
    {
        this.selectedSlot = selectedSlot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(selectedSlot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        selectedSlot = _buffer.readVaruint();
    }

    public static SelectTrade fromBuffer(byte[] buffer)
    {
        SelectTrade packet = new SelectTrade();
        packet.safeDecode(buffer);
        return packet;
    }

}
