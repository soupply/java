package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateAttributes extends soupply.bedrock261.Packet
{

    public static final int ID = 29;

    public long entityId;
    public soupply.bedrock261.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock261.type.Attribute[] attributes)
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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
