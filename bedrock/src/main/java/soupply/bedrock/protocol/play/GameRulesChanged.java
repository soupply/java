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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)rules.length);
        for(soupply.bedrock.type.Rule cvzm:rules)
        {
            cvzm.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bjbv = _buffer.readVaruint();
        rules = new soupply.bedrock.type.Rule[bjbv];
        for(int cvzm=0;cvzm<rules.length;cvzm++)
        {
            rules[cvzm].decodeBody(_buffer);
        }
    }

    public static GameRulesChanged fromBuffer(byte[] buffer)
    {
        GameRulesChanged packet = new GameRulesChanged();
        packet.safeDecode(buffer);
        return packet;
    }

}
