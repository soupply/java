package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock160.Packet
{

    public static final int ID = 29;

    public long entityId;
    public soupply.bedrock160.type.Attribute[] attributes;

    public UpdateAttributes()
    {
        this.attributes = new soupply.bedrock160.type.Attribute[]();
    }

    public UpdateAttributes(long entityId, soupply.bedrock160.type.Attribute[] attributes)
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
