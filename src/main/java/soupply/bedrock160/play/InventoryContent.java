package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock160.Packet
{

    public int window;
    public soupply.bedrock160.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock160.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
