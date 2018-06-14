package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class PlayerInput extends soupply.bedrock141.Packet
{

    public float sideways;
    public float forward;
    public boolean unknown2;
    public boolean unknown3;

    public PlayerInput()
    {
    }

    public PlayerInput(float sideways, float forward, boolean unknown2, boolean unknown3)
    {
        this.sideways = sideways;
        this.forward = forward;
        this.unknown2 = unknown2;
        this.unknown3 = unknown3;
    }

}
