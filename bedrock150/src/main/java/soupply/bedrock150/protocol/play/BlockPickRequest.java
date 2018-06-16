package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

class BlockPickRequest extends soupply.bedrock150.Packet
{

    public static final int ID = 34;

    public Tuples.IntXYZ position;
    public boolean unknown1;
    public byte slot;

    public BlockPickRequest()
    {
        this.position = new Tuples.IntXYZ();
    }

    public BlockPickRequest(Tuples.IntXYZ position, boolean unknown1, byte slot)
    {
        this.position = position;
        this.unknown1 = unknown1;
        this.slot = slot;
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
