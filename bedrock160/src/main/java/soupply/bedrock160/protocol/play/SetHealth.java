package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetHealth extends soupply.bedrock160.Packet
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
