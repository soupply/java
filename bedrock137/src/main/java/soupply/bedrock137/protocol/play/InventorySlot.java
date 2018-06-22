package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventorySlot extends soupply.bedrock137.Packet
{

    public static final int ID = 50;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
    }

    public static InventorySlot fromBuffer(byte[] buffer)
    {
        InventorySlot packet = new InventorySlot();
        packet.safeDecode(buffer);
        return packet;
    }

}
