package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class WindowItems extends soupply.java393.Packet
{

    public static final int ID = 21;

    public byte window;
    public soupply.java393.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java393.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeBigEndianShort((short)slots.length);
        for(soupply.java393.type.Slot cxdm:slots)
        {
            cxdm.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        final int bnbr = _buffer.readBigEndianShort();
        slots = new soupply.java393.type.Slot[bnbr];
        for(int cxdm=0;cxdm<slots.length;cxdm++)
        {
            slots[cxdm].decodeBody(_buffer);
        }
    }

    public static WindowItems fromBuffer(byte[] buffer)
    {
        WindowItems packet = new WindowItems();
        packet.safeDecode(buffer);
        return packet;
    }

}
