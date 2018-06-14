package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock137.Packet
{

    public soupply.bedrock137.type.Rule[] rules;

    public GameRulesChanged()
    {
    }

    public GameRulesChanged(soupply.bedrock137.type.Rule[] rules)
    {
        this.rules = rules;
    }

}
