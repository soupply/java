package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventoryContent extends soupply.bedrock137.Packet
{

    public static final int ID = 49;

    public int window;
    public soupply.bedrock137.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock137.type.Slot[] slots)
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
        _buffer.writeVaruint(window);
        _buffer.writeVaruint((int)slots.length);
        for(soupply.bedrock137.type.Slot cxdm:slots)
        {
            cxdm.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readVaruint();
        final int bnbr = _buffer.readVaruint();
        for(int cxdm=0;cxdm<slots.length;cxdm++)
        {
            slots[cxdm].decodeBody(_buffer);
        }
    }

    public static InventoryContent fromBuffer(byte[] buffer)
    {
        InventoryContent packet = new InventoryContent();
        packet.safeDecode(buffer);
        return packet;
    }

}
