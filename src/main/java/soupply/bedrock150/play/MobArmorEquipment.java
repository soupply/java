package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class MobArmorEquipment extends soupply.bedrock150.Packet
{

    public long entityId;
    public soupply.bedrock150.type.Slot[] armor;

    public MobArmorEquipment()
    {
    }

    public MobArmorEquipment(long entityId, soupply.bedrock150.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
    }

}
