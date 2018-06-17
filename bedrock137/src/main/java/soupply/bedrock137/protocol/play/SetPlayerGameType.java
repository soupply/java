package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetPlayerGameType extends soupply.bedrock137.Packet
{

    public static final int ID = 62;

    // gamemode
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;

    public int gamemode;

    public SetPlayerGameType()
    {
    }

    public SetPlayerGameType(int gamemode)
    {
        this.gamemode = gamemode;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(gamemode);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        gamemode = _buffer.readVarint();
    }

    public static SetPlayerGameType fromBuffer(byte[] buffer)
    {
        SetPlayerGameType packet = new SetPlayerGameType();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
