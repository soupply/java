package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class InventoryTransaction extends soupply.bedrock137.Packet
{

    public int type;
    public soupply.bedrock137.type.InventoryAction[] actions;

    public InventoryTransaction()
    {
    }

    public InventoryTransaction(int type, soupply.bedrock137.type.InventoryAction[] actions)
    {
        this.type = type;
        this.actions = actions;
    }

}
