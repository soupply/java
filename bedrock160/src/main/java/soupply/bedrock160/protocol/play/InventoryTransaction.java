package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventoryTransaction extends soupply.bedrock160.Packet
{

    public static final int ID = 30;

    public int type;
    public soupply.bedrock160.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
    }

    public InventoryTransaction(int type, soupply.bedrock160.type.InventoryAction[] actions)
    {
        this.type = type;
        this.actions = actions;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
        _buffer.writeVaruint((int)actions.length);
        for(soupply.bedrock160.type.InventoryAction yna9c:actions)
        {
            yna9c.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readVaruint();
        final int bfdlbm = _buffer.readVaruint();
        actions = new soupply.bedrock160.type.InventoryAction[bfdlbm];
        for(int yna9c=0;yna9c<actions.length;yna9c++)
        {
            actions[yna9c].decodeBody(_buffer);
        }
    }

    public static InventoryTransaction fromBuffer(byte[] buffer)
    {
        InventoryTransaction packet = new InventoryTransaction();
        packet.safeDecode(buffer);
        return packet;
    }

}
