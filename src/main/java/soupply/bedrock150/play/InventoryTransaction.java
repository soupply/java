package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class InventoryTransaction extends soupply.bedrock150.Packet
{

    public int type;
    public soupply.bedrock150.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
    }

    public InventoryTransaction(int type, soupply.bedrock150.type.InventoryAction[] actions)
    {
        this.type = type;
        this.actions = actions;
    }

}
