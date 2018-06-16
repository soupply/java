package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class MobArmorEquipment extends soupply.bedrock160.Packet
{

    public static final int ID = 32;

    public long entityId;
    public soupply.bedrock160.type.Slot[] armor;

    public MobArmorEquipment()
    {
        this.armor = new soupply.bedrock160.type.Slot[4];
    }

    public MobArmorEquipment(long entityId, soupply.bedrock160.type.Slot[] armor)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
