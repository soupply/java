package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class PhotoTransfer extends soupply.bedrock160.Packet
{

    public static final int ID = 99;

    public String unknown0;
    public String unknown1;
    public String unknown2;

    public PhotoTransfer()
    {
    }

    public PhotoTransfer(String unknown0, String unknown1, String unknown2)
    {
        this.unknown0 = unknown0;
        this.unknown1 = unknown1;
        this.unknown2 = unknown2;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
