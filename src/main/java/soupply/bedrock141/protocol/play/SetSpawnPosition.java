package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class SetSpawnPosition extends soupply.bedrock141.Packet
{

    public static final int ID = 43;

    // type
    public static final int PLAYER_SPAWN = 0;
    public static final int WORLD_SPAWN = 1;

    public int type;
    public soupply.bedrock141.type.BlockPosition position;
    public boolean forced;

    public SetSpawnPosition()
    {
    }

    public SetSpawnPosition(int type, soupply.bedrock141.type.BlockPosition position, boolean forced)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
