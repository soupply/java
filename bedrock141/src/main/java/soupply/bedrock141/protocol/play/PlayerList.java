package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerList extends soupply.bedrock141.Packet
{

    public static final int ID = 63;

    public byte action;

    public PlayerList()
    {
    }

    public PlayerList(byte action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readByte();
    }

    public static PlayerList fromBuffer(byte[] buffer)
    {
        PlayerList packet = new PlayerList();
        packet.safeDecode(buffer);
        return packet;
    }

}
