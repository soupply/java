package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class NpcRequest extends soupply.bedrock137.Packet
{

    public long entityId;
    public byte requestType;
    public String command;
    public byte actionType;

    public NpcRequest()
    {
    }

    public NpcRequest(long entityId, byte requestType, String command, byte actionType)
    {
        this.entityId = entityId;
        this.requestType = requestType;
        this.command = command;
        this.actionType = actionType;
    }

}
