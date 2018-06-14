package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class MobArmorEquipment extends soupply.bedrock160.Packet
{

    public long entityId;
    public soupply.bedrock160.type.Slot[] armor;

    public MobArmorEquipment()
    {
    }

    public MobArmorEquipment(long entityId, soupply.bedrock160.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
    }

}
