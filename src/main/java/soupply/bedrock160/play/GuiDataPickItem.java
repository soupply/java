package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class GuiDataPickItem extends soupply.bedrock160.Packet
{

    public int slot;

    public GuiDataPickItem()
    {
    }

    public GuiDataPickItem(int slot)
    {
        this.slot = slot;
    }

}
