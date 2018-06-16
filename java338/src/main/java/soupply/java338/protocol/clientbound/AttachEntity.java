package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class AttachEntity extends soupply.java338.Packet
{

    public static final int ID = 61;

    public int target;
    public int holder;

    public AttachEntity()
    {
    }

    public AttachEntity(int target, int holder)
    {
        this.target = target;
        this.holder = holder;
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
