package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

class AddBehaviorTree extends soupply.bedrock.Packet
{

    public static final int ID = 89;

    public String unknown0;

    public AddBehaviorTree()
    {
    }

    public AddBehaviorTree(String unknown0)
    {
        this.unknown0 = unknown0;
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
