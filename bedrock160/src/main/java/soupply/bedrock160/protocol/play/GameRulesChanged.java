package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class GameRulesChanged extends soupply.bedrock160.Packet
{

    public static final int ID = 72;

    public soupply.bedrock160.type.Rule[] rules;

    public GameRulesChanged()
    {
        this.rules = new soupply.bedrock160.type.Rule[]();
    }

    public GameRulesChanged(soupply.bedrock160.type.Rule[] rules)
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