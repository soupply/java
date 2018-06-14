package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class InventoryAction extends Type
{

    // source
    public static final int CONTAINER = 0;
    public static final int WORLD = 2;
    public static final int CREATIVE = 3;

    public int source;
    public int container = -1;
    public int unknown2;
    public int slot;
    public soupply.bedrock141.type.Slot oldItem;
    public soupply.bedrock141.type.Slot newItem;

    public InventoryAction()
    {
    }

    public InventoryAction(int source, int container, int unknown2, int slot, soupply.bedrock141.type.Slot oldItem, soupply.bedrock141.type.Slot newItem)
    {
        this.source = source;
        this.container = container;
        this.unknown2 = unknown2;
        this.slot = slot;
        this.oldItem = oldItem;
        this.newItem = newItem;
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
