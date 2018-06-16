package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class BlockPickRequest extends soupply.bedrock160.Packet
{

    public static final int ID = 34;

    public IntXYZ position;
    public boolean unknown1;
    public byte slot;

    public BlockPickRequest()
    {
        this.position = new IntXYZ();
    }

    public BlockPickRequest(IntXYZ position, boolean unknown1, byte slot)
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
