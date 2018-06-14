package soupply.java338.clientbound;

import java.util.*;
import soupply.util.*;

class AdvancementProgress extends soupply.java338.Packet
{

    public boolean notEmpty;
    public String identifier;

    public AdvancementProgress()
    {
    }

    public AdvancementProgress(boolean notEmpty, String identifier)
    {
        this.notEmpty = notEmpty;
        this.identifier = identifier;
    }

}
