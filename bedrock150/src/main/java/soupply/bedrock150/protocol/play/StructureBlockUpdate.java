package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class StructureBlockUpdate extends soupply.bedrock150.Packet
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
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
    }

    public static StructureBlockUpdate fromBuffer(byte[] buffer)
    {
        StructureBlockUpdate packet = new StructureBlockUpdate();
        packet.safeDecode(buffer);
        return packet;
    }

}
