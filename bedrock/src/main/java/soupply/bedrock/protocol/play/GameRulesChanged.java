package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class GameRulesChanged extends soupply.bedrock.Packet
{

    public static final int ID = 72;

    public soupply.bedrock.type.Rule[] rules;

    public GameRulesChanged()
    {
    }

    public GameRulesChanged(soupply.bedrock.type.Rule[] rules)
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
