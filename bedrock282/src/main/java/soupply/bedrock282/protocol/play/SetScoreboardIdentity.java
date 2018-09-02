package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetScoreboardIdentity extends soupply.bedrock282.Packet
{

    public static final int ID = 112;

    // type
    public static final byte REGISTER = (byte)0;
    public static final byte CLEAR = (byte)1;

    public byte type;
    public soupply.bedrock282.type.RegisterEntry[] registerEntries;
    public long[] clearEntries;

    public SetScoreboardIdentity()
    {
    }

    public SetScoreboardIdentity(byte type, soupply.bedrock282.type.RegisterEntry[] registerEntries, long[] clearEntries)
    {
        this.type = type;
        this.registerEntries = registerEntries;
        this.clearEntries = clearEntries;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(type);
        if(type==0)
        {
            _buffer.writeVaruint((int)registerEntries.length);
            for(soupply.bedrock282.type.RegisterEntry cvanzjbr:registerEntries)
            {
                cvanzjbr.encodeBody(_buffer);
            }
        }
        if(type==1)
        {
            _buffer.writeVaruint((int)clearEntries.length);
            for(long yxyjbrav:clearEntries)
            {
                _buffer.writeVarlong(yxyjbrav);
            }
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        type = _buffer.readByte();
        if(type==0)
        {
            final int bjzldvr5 = _buffer.readVaruint();
            registerEntries = new soupply.bedrock282.type.RegisterEntry[bjzldvr5];
            for(int cvanzjbr=0;cvanzjbr<registerEntries.length;cvanzjbr++)
            {
                registerEntries[cvanzjbr].decodeBody(_buffer);
            }
        }
        if(type==1)
        {
            final int bnzfr5cl = _buffer.readVaruint();
            clearEntries = new long[bnzfr5cl];
            for(int yxyjbrav=0;yxyjbrav<clearEntries.length;yxyjbrav++)
            {
                clearEntries[yxyjbrav] = _buffer.readVarlong();
            }
        }
    }

    public static SetScoreboardIdentity fromBuffer(byte[] buffer)
    {
        SetScoreboardIdentity packet = new SetScoreboardIdentity();
        packet.safeDecode(buffer);
        return packet;
    }

}
