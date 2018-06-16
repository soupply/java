package soupply.bedrock150.type;

import java.util.*;
import soupply.util.*;

public class InventoryAction extends Type
{

    // source
    public static final int CONTAINER = (int)0;
    public static final int WORLD = (int)2;
    public static final int CREATIVE = (int)3;

    public int source;
    public int container = -1;
    public int unknown2;
    public int slot;
    public soupply.bedrock150.type.Slot oldItem;
    public soupply.bedrock150.type.Slot newItem;

    public InventoryAction()
    {
        this.oldItem = new soupply.bedrock150.type.Slot();
        this.newItem = new soupply.bedrock150.type.Slot();
    }

    public InventoryAction(int source, int container, int unknown2, int slot, soupply.bedrock150.type.Slot oldItem, soupply.bedrock150.type.Slot newItem)
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
