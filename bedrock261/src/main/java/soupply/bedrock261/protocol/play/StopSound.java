package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class StopSound extends soupply.bedrock261.Packet
{

    public static final int ID = 87;

    public String name;
    public boolean stopAll;

    public StopSound()
    {
    }

    public StopSound(String name, boolean stopAll)
    {
        this.name = name;
        this.stopAll = stopAll;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeBool(stopAll);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        stopAll = _buffer.readBool();
    }

    public static StopSound fromBuffer(byte[] buffer)
    {
        StopSound packet = new StopSound();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
