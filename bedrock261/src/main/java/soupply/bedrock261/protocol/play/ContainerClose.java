package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class ContainerClose extends soupply.bedrock261.Packet
{

    public static final int ID = 47;

    public byte window;

    public ContainerClose()
    {
    }

    public ContainerClose(byte window)
    {
        this.window = window;
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
