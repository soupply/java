package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class SetHealth extends soupply.bedrock141.Packet
{

    public static final int ID = 42;

    public int health;

    public SetHealth()
    {
    }

    public SetHealth(int health)
    {
        this.health = health;
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
