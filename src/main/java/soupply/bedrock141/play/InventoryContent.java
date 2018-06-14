package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock141.Packet
{

    public int window;
    public soupply.bedrock141.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock141.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
