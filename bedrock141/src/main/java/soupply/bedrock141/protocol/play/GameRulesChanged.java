package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock141.Packet
{

    public static final int ID = 72;

    public soupply.bedrock141.type.Rule[] rules;

    public GameRulesChanged()
    {
        this.rules = new soupply.bedrock141.type.Rule[]();
    }

    public GameRulesChanged(soupply.bedrock141.type.Rule[] rules)
    {
        this.rules = rules;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
