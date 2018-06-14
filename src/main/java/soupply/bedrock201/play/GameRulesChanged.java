package soupply.bedrock201.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock201.Packet
{

    public soupply.bedrock201.type.Rule[] rules;

    public GameRulesChanged()
    {
    }

    public GameRulesChanged(soupply.bedrock201.type.Rule[] rules)
    {
        this.rules = rules;
    }

}
