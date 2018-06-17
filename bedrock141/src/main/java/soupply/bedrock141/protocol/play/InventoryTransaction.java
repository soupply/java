package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class InventoryTransaction extends soupply.bedrock141.Packet
{

    public static final int ID = 30;

    public int type;
    public soupply.bedrock141.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
    }

    public InventoryTransaction(int type, soupply.bedrock141.type.InventoryAction[] actions)
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
