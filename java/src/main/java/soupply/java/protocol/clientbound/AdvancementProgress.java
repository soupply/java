package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class AdvancementProgress extends soupply.java.Packet
{

    public static final int ID = 55;

    public boolean notEmpty;
    public String identifier;

    public AdvancementProgress()
    {
    }

    public AdvancementProgress(boolean notEmpty, String identifier)
    {
        this.notEmpty = notEmpty;
        this.identifier = identifier;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBool(notEmpty);
        byte[] arbrzlc = _buffer.convertString(identifier);
        _buffer.writeVaruint((int)arbrzlc.length);
        _buffer.writeBytes(arbrzlc);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        notEmpty = _buffer.readBool();
        final int bvarbrzl = _buffer.readVaruint();
        identifier = _buffer.readString(bvarbrzl);
    }

    public static AdvancementProgress fromBuffer(byte[] buffer)
    {
        AdvancementProgress packet = new AdvancementProgress();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
