package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class Respawn extends soupply.bedrock141.Packet
{

    public Tuples.FloatXYZ position;

    public Respawn()
    {
    }

    public Respawn(Tuples.FloatXYZ position)
    {
        this.position = position;
    }

}
