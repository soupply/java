package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock141.Packet
{

    public soupply.bedrock141.type.Rule[] rules;

    public GameRulesChanged()
    {
    }

    public GameRulesChanged(soupply.bedrock141.type.Rule[] rules)
    {
        this.rules = rules;
    }

}
