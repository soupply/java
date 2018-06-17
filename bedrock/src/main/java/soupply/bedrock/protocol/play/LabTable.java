package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class LabTable extends soupply.bedrock.Packet
{

    public static final int ID = 109;

    public byte unknown0;
    public soupply.bedrock.type.BlockPosition position;
    public byte reactionType;

    public LabTable()
    {
        this.position = new soupply.bedrock.type.BlockPosition();
    }

    public LabTable(byte unknown0, soupply.bedrock.type.BlockPosition position, byte reactionType)
    {
        this.unknown0 = unknown0;
        this.position = position;
        this.reactionType = reactionType;
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
