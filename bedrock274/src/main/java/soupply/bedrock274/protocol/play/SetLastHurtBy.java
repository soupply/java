package soupply.bedrock274.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetLastHurtBy extends soupply.bedrock274.Packet
{

    public static final int ID = 96;

    public int unknown0;

    public SetLastHurtBy()
    {
    }

    public SetLastHurtBy(int unknown0)
    {
        this.unknown0 = unknown0;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(unknown0);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        unknown0 = _buffer.readVarint();
    }

    public static SetLastHurtBy fromBuffer(byte[] buffer)
    {
        SetLastHurtBy packet = new SetLastHurtBy();
        packet.safeDecode(buffer);
        return packet;
    }

}
