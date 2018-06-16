package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock150.Packet
{

    public static final int ID = 29;

    public long entityId;
    public soupply.bedrock150.type.Attribute[] attributes;

    public UpdateAttributes()
    {
        this.attributes = new soupply.bedrock150.type.Attribute[]();
    }

    public UpdateAttributes(long entityId, soupply.bedrock150.type.Attribute[] attributes)
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
