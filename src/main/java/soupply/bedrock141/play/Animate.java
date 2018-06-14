package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class Animate extends soupply.bedrock141.Packet
{

    // action
    public static final int BREAKING = 1;
    public static final int WAKE_UP = 3;

    public int action;
    public long entityId;
    public float unknown2;

    public Animate()
    {
    }

    public Animate(int action, long entityId, float unknown2)
    {
        this.action = action;
        this.entityId = entityId;
        this.unknown2 = unknown2;
    }

}
