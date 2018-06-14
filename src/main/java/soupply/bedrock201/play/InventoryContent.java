package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock201.Packet
{

    public int window;
    public soupply.bedrock201.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock201.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
