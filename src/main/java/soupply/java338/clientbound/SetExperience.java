package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class SetExperience extends soupply.java338.Packet
{

    public float experience;
    public int level;
    public int totalExperience;

    public SetExperience()
    {
    }

    public SetExperience(float experience, int level, int totalExperience)
    {
        this.experience = experience;
        this.level = level;
        this.totalExperience = totalExperience;
    }

}
