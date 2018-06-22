package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetDisplayObjective extends soupply.bedrock261.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        byte[] zlcxenbq = _buffer.convertString(displaySlot);
        _buffer.writeVaruint((int)zlcxenbq.length);
        _buffer.writeBytes(zlcxenbq);
        byte[] bjznaztf = _buffer.convertString(objectiveName);
        _buffer.writeVaruint((int)bjznaztf.length);
        _buffer.writeBytes(bjznaztf);
        byte[] zlcxe5bu = _buffer.convertString(displayName);
        _buffer.writeVaruint((int)zlcxe5bu.length);
        _buffer.writeBytes(zlcxe5bu);
        byte[] yjdvafy1 = _buffer.convertString(criteriaName);
        _buffer.writeVaruint((int)yjdvafy1.length);
        _buffer.writeBytes(yjdvafy1);
        _buffer.writeVarint(sortOrder);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvzlcxen = _buffer.readVaruint();
        displaySlot = _buffer.readString(bvzlcxen);
        final int bvbjznaz = _buffer.readVaruint();
        objectiveName = _buffer.readString(bvbjznaz);
        final int bvzlcxe5 = _buffer.readVaruint();
        displayName = _buffer.readString(bvzlcxe5);
        final int bvyjdvaf = _buffer.readVaruint();
        criteriaName = _buffer.readString(bvyjdvaf);
        sortOrder = _buffer.readVarint();
    }

    public static SetDisplayObjective fromBuffer(byte[] buffer)
    {
        SetDisplayObjective packet = new SetDisplayObjective();
        packet.safeDecode(buffer);
        return packet;
    }

}
