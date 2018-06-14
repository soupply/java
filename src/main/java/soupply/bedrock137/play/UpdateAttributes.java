package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class UpdateAttributes extends soupply.bedrock137.Packet
{

    public long entityId;
    public soupply.bedrock137.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock137.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

}
