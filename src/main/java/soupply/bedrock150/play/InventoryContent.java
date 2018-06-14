package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class InventoryContent extends soupply.bedrock150.Packet
{

    public int window;
    public soupply.bedrock150.type.Slot[] slots;

    public InventoryContent()
    {
    }

    public InventoryContent(int window, soupply.bedrock150.type.Slot[] slots)
    {
        this.window = window;
        this.slots = slots;
    }

}
