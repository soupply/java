package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class StructureBlockUpdate extends soupply.bedrock.Packet
{

    public static final int ID = 90;

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
    }

    public static StructureBlockUpdate fromBuffer(byte[] buffer)
    {
        StructureBlockUpdate packet = new StructureBlockUpdate();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
