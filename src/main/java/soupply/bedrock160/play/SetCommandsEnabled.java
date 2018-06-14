package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class SetCommandsEnabled extends soupply.bedrock160.Packet
{

    public boolean enabled;

    public SetCommandsEnabled()
    {
    }

    public SetCommandsEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

}
