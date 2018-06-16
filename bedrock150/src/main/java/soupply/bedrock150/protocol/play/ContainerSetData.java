package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class ContainerSetData extends soupply.bedrock150.Packet
{

    public static final int ID = 51;

    public byte window;
    public int property;
    public int value;

    public ContainerSetData()
    {
    }

    public ContainerSetData(byte window, int property, int value)
    {
        this.window = window;
        this.property = property;
        this.value = value;
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
    public void decodeBody(Buffer buffer)
    {
    }

}
