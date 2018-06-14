package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class SetEntityMotion extends soupply.bedrock150.Packet
{

    public long entityId;
    public Tuples.FloatXYZ motion;

    public SetEntityMotion()
    {
    }

    public SetEntityMotion(long entityId, Tuples.FloatXYZ motion)
    {
        this.entityId = entityId;
        this.motion = motion;
    }

}
