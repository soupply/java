package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock137.Packet
{

    public int window;
    public soupply.bedrock137.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock137.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
