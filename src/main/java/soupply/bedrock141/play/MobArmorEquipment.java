package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class MobArmorEquipment extends soupply.bedrock141.Packet
{

    public long entityId;
    public soupply.bedrock141.type.Slot[] armor;

    public MobArmorEquipment()
    {
    }

    public MobArmorEquipment(long entityId, soupply.bedrock141.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
    }

}
