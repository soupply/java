package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java338.Packet
{

    public static final int ID = 78;

    public int entityId;
    public soupply.java338.type.Attribute[] attributes;

    public EntityProperties()
    {
        this.attributes = new soupply.java338.type.Attribute[]();
    }

    public EntityProperties(int entityId, soupply.java338.type.Attribute[] attributes)
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
