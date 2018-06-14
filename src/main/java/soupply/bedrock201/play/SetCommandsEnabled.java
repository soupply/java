package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class SetCommandsEnabled extends soupply.bedrock201.Packet
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
