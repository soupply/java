package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class GameRulesChanged extends soupply.bedrock137.Packet
{

    public static final int ID = 72;

    public soupply.bedrock137.type.Rule[] rules;

    public GameRulesChanged()
    {
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)rules.length);
        for(soupply.bedrock137.type.Rule cvzm:rules)
        {
            cvzm.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bjbv = _buffer.readVaruint();
        for(int cvzm=0;cvzm<rules.length;cvzm++)
        {
            rules[cvzm].decodeBody(_buffer);
        }
    }

    public static GameRulesChanged fromBuffer(byte[] buffer)
    {
        GameRulesChanged packet = new GameRulesChanged();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
