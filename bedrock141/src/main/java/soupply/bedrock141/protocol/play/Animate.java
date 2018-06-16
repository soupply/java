package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class Animate extends soupply.bedrock141.Packet
{

    public static final int ID = 44;

    // action
    public static final int BREAKING = (int)1;
    public static final int WAKE_UP = (int)3;

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

    @Override
    public int getId()
    {
        return ID;
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
