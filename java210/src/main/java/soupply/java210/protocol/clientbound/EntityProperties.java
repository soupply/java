package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class EntityProperties extends soupply.java210.Packet
{

    public static final int ID = 74;

    public int entityId;
    public soupply.java210.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java210.type.Attribute[] attributes)
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
        _buffer.writeVaruint((int)attributes.length);
        for(soupply.java210.type.Attribute yrcldrc:attributes)
        {
            yrcldrc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
        final int bfdjyvzm = _buffer.readVaruint();
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
