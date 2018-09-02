package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetLocalPlayerAsInitialized extends soupply.bedrock282.Packet
{

    public static final int ID = 113;

    public long entityRuntimeId;

    public SetLocalPlayerAsInitialized()
    {
    }

    public SetLocalPlayerAsInitialized(long entityRuntimeId)
    {
        this.entityRuntimeId = entityRuntimeId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarulong(entityRuntimeId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityRuntimeId = _buffer.readVarulong();
    }

    public static SetLocalPlayerAsInitialized fromBuffer(byte[] buffer)
    {
        SetLocalPlayerAsInitialized packet = new SetLocalPlayerAsInitialized();
        packet.safeDecode(buffer);
        return packet;
    }

}
