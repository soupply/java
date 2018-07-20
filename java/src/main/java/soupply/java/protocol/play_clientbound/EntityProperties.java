package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class EntityProperties extends soupply.java.Packet
{

    public static final int ID = 82;

    public int entityId;
    public soupply.java.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        _buffer.writeBigEndianInt((int)attributes.length);
        for(soupply.java.type.Attribute yrcldrc:attributes)
        {
            yrcldrc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        final int bfdjyvzm = _buffer.readBigEndianInt();
        attributes = new soupply.java.type.Attribute[bfdjyvzm];
        for(int yrcldrc=0;yrcldrc<attributes.length;yrcldrc++)
        {
            attributes[yrcldrc].decodeBody(_buffer);
        }
    }

    public static EntityProperties fromBuffer(byte[] buffer)
    {
        EntityProperties packet = new EntityProperties();
        packet.safeDecode(buffer);
        return packet;
    }

}
