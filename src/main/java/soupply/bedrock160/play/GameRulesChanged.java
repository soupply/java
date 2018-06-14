package soupply.bedrock160.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock160.Packet
{

    public soupply.bedrock160.type.Rule[] rules;

    public GameRulesChanged()
    {
    }

    public GameRulesChanged(soupply.bedrock160.type.Rule[] rules)
    {
        this.rules = rules;
    }

}
