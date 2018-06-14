package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class Text extends soupply.bedrock160.Packet
{

    public byte type;
    public boolean unknown1;

    public Text()
    {
    }

    public Text(byte type, boolean unknown1)
    {
        this.type = type;
        this.unknown1 = unknown1;
    }

}
