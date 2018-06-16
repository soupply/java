package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

class InventoryTransaction extends soupply.bedrock201.Packet
{

    public static final int ID = 30;

    public int type;
    public soupply.bedrock201.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
        this.actions = new soupply.bedrock201.type.InventoryAction[]();
    }

    public InventoryTransaction(int type, soupply.bedrock201.type.InventoryAction[] actions)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
