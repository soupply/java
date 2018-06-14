package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class InventoryTransaction extends soupply.bedrock201.Packet
{

    public int type;
    public soupply.bedrock201.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
    }

    public InventoryTransaction(int type, soupply.bedrock201.type.InventoryAction[] actions)
    {
        this.type = type;
        this.actions = actions;
    }

}
