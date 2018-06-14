package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.bedrock141.Packet
{

    public Tuples.FloatXYZ position;
    public int count;

    public SpawnExperienceOrb()
    {
    }

    public SpawnExperienceOrb(Tuples.FloatXYZ position, int count)
    {
        this.position = position;
        this.count = count;
    }

}
