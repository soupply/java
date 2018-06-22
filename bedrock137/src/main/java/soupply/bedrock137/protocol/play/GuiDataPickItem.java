package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class GuiDataPickItem extends soupply.bedrock137.Packet
{

    public static final int ID = 54;

    public int slot;

    public GuiDataPickItem()
    {
    }

    public GuiDataPickItem(int slot)
    {
        this.slot = slot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianInt(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        slot = _buffer.readLittleEndianInt();
    }

    public static GuiDataPickItem fromBuffer(byte[] buffer)
    {
        GuiDataPickItem packet = new GuiDataPickItem();
        packet.safeDecode(buffer);
        return packet;
    }

}
