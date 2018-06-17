package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class ShowProfile extends soupply.bedrock160.Packet
{

    public static final int ID = 104;

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

    public static ShowProfile fromBuffer(byte[] buffer)
    {
        ShowProfile packet = new ShowProfile();
        packet.safeDecode(buffer);
        return packet;
    }

}
