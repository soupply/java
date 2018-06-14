package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock160.Packet
{

    public long entityId;
    public soupply.bedrock160.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock160.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
