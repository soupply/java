package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class InventoryTransaction extends soupply.bedrock141.Packet
{

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

}
