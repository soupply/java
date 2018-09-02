package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetDefaultGameType extends soupply.bedrock282.Packet
{

    public static final int ID = 105;

    // game type
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;

    public int gameType;

    public SetDefaultGameType()
    {
    }

    public SetDefaultGameType(int gameType)
    {
        this.gameType = gameType;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(gameType);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        gameType = _buffer.readVaruint();
    }

    public static SetDefaultGameType fromBuffer(byte[] buffer)
    {
        SetDefaultGameType packet = new SetDefaultGameType();
        packet.safeDecode(buffer);
        return packet;
    }

}
