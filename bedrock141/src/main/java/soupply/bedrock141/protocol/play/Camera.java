package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class Camera extends soupply.bedrock141.Packet
{

    public static final int ID = 73;

    public long unknown0;
    public long unknown1;

    public Camera()
    {
    }

    public Camera(long unknown0, long unknown1)
    {
        this.unknown0 = unknown0;
        this.unknown1 = unknown1;
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
