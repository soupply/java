package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class AddBehaviorTree extends soupply.bedrock150.Packet
{

    public static final int ID = 89;

    public String unknown0;

    public AddBehaviorTree()
    {
    }

    public AddBehaviorTree(String unknown0)
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
        byte[] d5b9ba = _buffer.convertString(unknown0);
        _buffer.writeVaruint((int)d5b9ba.length);
        _buffer.writeBytes(d5b9ba);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvd5b9ba = _buffer.readVaruint();
        unknown0 = _buffer.readString(bvd5b9ba);
    }

    public static AddBehaviorTree fromBuffer(byte[] buffer)
    {
        AddBehaviorTree packet = new AddBehaviorTree();
        packet.safeDecode(buffer);
        return packet;
    }

}
