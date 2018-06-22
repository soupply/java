package soupply.java210.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class AttachEntity extends soupply.java210.Packet
{

    public static final int ID = 58;

    public int target;
    public int holder;

    public AttachEntity()
    {
    }

    public AttachEntity(int target, int holder)
    {
        this.target = target;
        this.holder = holder;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(target);
        _buffer.writeBigEndianInt(holder);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        target = _buffer.readBigEndianInt();
        holder = _buffer.readBigEndianInt();
    }

    public static AttachEntity fromBuffer(byte[] buffer)
    {
        AttachEntity packet = new AttachEntity();
        packet.safeDecode(buffer);
        return packet;
    }

}
