package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Camera extends soupply.java338.Packet
{

    public static final int ID = 57;

    public int entityId;

    public Camera()
    {
    }

    public Camera(int entityId)
    {
        this.entityId = entityId;
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
