package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class MobArmorEquipment extends soupply.bedrock137.Packet
{

    public long entityId;
    public soupply.bedrock137.type.Slot[] armor;

    public MobArmorEquipment()
    {
    }

    public MobArmorEquipment(long entityId, soupply.bedrock137.type.Slot[] armor)
    {
        this.entityId = entityId;
        this.armor = armor;
    }

}
