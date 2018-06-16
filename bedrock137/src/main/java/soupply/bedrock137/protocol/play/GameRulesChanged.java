package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock137.Packet
{

    public static final int ID = 72;

    public soupply.bedrock137.type.Rule[] rules;

    public GameRulesChanged()
    {
        this.rules = new soupply.bedrock137.type.Rule[]();
    }

    public GameRulesChanged(soupply.bedrock137.type.Rule[] rules)
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