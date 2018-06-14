package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock150.Packet
{

    public long entityId;
    public soupply.bedrock150.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock150.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
