package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetDisplayObjective extends soupply.bedrock.Packet
{

    public static final int ID = 107;

    public String displaySlot;
    public String objectiveName;
    public String displayName;
    public String criteriaName;
    public int sortOrder;

    public SetDisplayObjective()
    {
    }

    public SetDisplayObjective(String displaySlot, String objectiveName, String displayName, String criteriaName, int sortOrder)
    {
        this.displaySlot = displaySlot;
        this.objectiveName = objectiveName;
        this.displayName = displayName;
        this.criteriaName = criteriaName;
        this.sortOrder = sortOrder;
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
