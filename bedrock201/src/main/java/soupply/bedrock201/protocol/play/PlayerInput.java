package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerInput extends soupply.bedrock201.Packet
{

    public static final int ID = 57;

    public float sideways;
    public float forward;
    public boolean unknown2;
    public boolean unknown3;

    public PlayerInput()
    {
    }

    public PlayerInput(float sideways, float forward, boolean unknown2, boolean unknown3)
    {
        this.sideways = sideways;
        this.forward = forward;
        this.unknown2 = unknown2;
        this.unknown3 = unknown3;
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
