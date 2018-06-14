package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class SpawnExperienceOrb extends soupply.bedrock160.Packet
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
