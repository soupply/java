package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateEquip extends soupply.bedrock141.Packet
{

    public static final int ID = 81;

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

    public static UpdateEquip fromBuffer(byte[] buffer)
    {
        UpdateEquip packet = new UpdateEquip();
        packet.safeDecode(buffer);
        return packet;
    }

}
