package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetEntityMotion extends soupply.bedrock160.Packet
{

    public static final int ID = 40;

    public long entityId;
    public FloatXYZ motion;

    public SetEntityMotion()
    {
        this.motion = new FloatXYZ();
    }

    public SetEntityMotion(long entityId, FloatXYZ motion)
    {
        this.entityId = entityId;
        this.motion = motion;
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
