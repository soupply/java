package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class MobArmorEquipment extends soupply.bedrock137.Packet
{

    public static final int ID = 32;

    public long entityId;
    public soupply.bedrock137.type.Slot[] armor;

    public MobArmorEquipment()
    {
        this.armor = new soupply.bedrock137.type.Slot[4];
    }

    public MobArmorEquipment(long entityId, soupply.bedrock137.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
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
