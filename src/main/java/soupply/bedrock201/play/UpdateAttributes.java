package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock201.Packet
{

    public long entityId;
    public soupply.bedrock201.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock201.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
