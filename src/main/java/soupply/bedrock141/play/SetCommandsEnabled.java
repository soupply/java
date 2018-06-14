package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class SetCommandsEnabled extends soupply.bedrock141.Packet
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
