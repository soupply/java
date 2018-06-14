package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class EntityProperties extends soupply.java335.Packet
{

    public static final int ID = 77;

    public int entityId;
    public soupply.java335.type.Attribute[] attributes;

    public EntityProperties()
    {
    }

    public EntityProperties(int entityId, soupply.java335.type.Attribute[] attributes)
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
