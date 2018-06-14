package soupply.java315.serverbound;

import java.util.*;
import soupply.util.*;

class UseItem extends soupply.java315.Packet
{

    // hand
    public static final int MAIN_HAND = 0;
    public static final int OFF_HAND = 1;

    public int hand;

    public UseItem()
    {
    }

    public UseItem(int hand)
    {
        this.hand = hand;
    }

}
