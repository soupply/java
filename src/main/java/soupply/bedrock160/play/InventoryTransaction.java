package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class InventoryTransaction extends soupply.bedrock160.Packet
{

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

}
