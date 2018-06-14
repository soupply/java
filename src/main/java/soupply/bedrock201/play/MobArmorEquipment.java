package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class MobArmorEquipment extends soupply.bedrock201.Packet
{

    public long entityId;
    public soupply.bedrock201.type.Slot[] armor;

    public MobArmorEquipment()
    {
    }

    public MobArmorEquipment(long entityId, soupply.bedrock201.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
    }

}
