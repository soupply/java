package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetSpawnPosition extends soupply.bedrock137.Packet
{

    public static final int ID = 43;

    // type
    public static final int PLAYER_SPAWN = (int)0;
    public static final int WORLD_SPAWN = (int)1;

    public int type;
    public soupply.bedrock137.type.BlockPosition position;
    public boolean forced;

    public SetSpawnPosition()
    {
        this.position = new soupply.bedrock137.type.BlockPosition();
    }

    public SetSpawnPosition(int type, soupply.bedrock137.type.BlockPosition position, boolean forced)
    {
        this.type = type;
        this.position = position;
        this.forced = forced;
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
