package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock150.Packet
{

    public soupply.bedrock150.type.Rule[] rules;

    public GameRulesChanged()
    {
    }

    public GameRulesChanged(soupply.bedrock150.type.Rule[] rules)
    {
        this.rules = rules;
    }

}
