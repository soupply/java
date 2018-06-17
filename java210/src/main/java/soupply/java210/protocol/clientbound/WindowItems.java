package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class WindowItems extends soupply.java210.Packet
{

    public static final int ID = 20;

    public byte window;
    public soupply.java210.type.Slot[] slots;

    public WindowItems()
    {
    }

    public WindowItems(byte window, soupply.java210.type.Slot[] slots)
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
        _buffer.writeVaruint((int)slots.length);
        for(soupply.java210.type.Slot cxdm:slots)
        {
            cxdm.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readByte();
        final int bnbr = _buffer.readVaruint();
        slots = new soupply.java210.type.Slot[bnbr];
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
