package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class ShowCredits extends soupply.bedrock.Packet
{

    public static final int ID = 75;

    // status
    public static final int START = (int)0;
    public static final int END = (int)1;

    public long entityId;
    public int status;

    public ShowCredits()
    {
    }

    public ShowCredits(long entityId, int status)
    {
        this.entityId = entityId;
        this.status = status;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeVarint(status);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        status = _buffer.readVarint();
    }

    public static ShowCredits fromBuffer(byte[] buffer)
    {
        ShowCredits packet = new ShowCredits();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
