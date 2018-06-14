package soupply.java335.serverbound;

import java.util.*;
import soupply.util.*;

class Animation extends soupply.java335.Packet
{

    // hand
    public static final int MAIN_HAND = 0;
    public static final int OFF_HAND = 1;

    public int hand;

    public Animation()
    {
    }

    public Animation(int hand)
    {
        this.hand = hand;
    }

}
