package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock141.Packet
{

    public long entityId;
    public soupply.bedrock141.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock141.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
