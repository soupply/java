package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java315.Packet
{

    public static final int ID = 74;

    public int entityId;
    public soupply.java315.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java315.type.Attribute[] attributes)
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
