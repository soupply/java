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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        for(soupply.bedrock137.type.Slot yjbi:armor)
        {
            yjbi.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        for(int yjbi=0;yjbi<armor.length;yjbi++)
        {
            armor[yjbi].decodeBody(_buffer);
        }
    }

    public static MobArmorEquipment fromBuffer(byte[] buffer)
    {
        MobArmorEquipment packet = new MobArmorEquipment();
        packet.safeDecode(buffer);
        return packet;
    }

}
