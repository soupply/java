package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class StopSound extends soupply.bedrock137.Packet
{

    public String name;
    public boolean stopAll;

    public StopSound()
    {
    }

    public StopSound(String name, boolean stopAll)
    {
        this.name = name;
        this.stopAll = stopAll;
    }

}
