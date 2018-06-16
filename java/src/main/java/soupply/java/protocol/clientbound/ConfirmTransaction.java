package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

class ConfirmTransaction extends soupply.java.Packet
{

    public static final int ID = 17;

    public byte window;
    public short action;
    public boolean accepted;

    public ConfirmTransaction()
    {
    }

    public ConfirmTransaction(byte window, short action, boolean accepted)
    {
        this.window = window;
        this.action = action;
        this.accepted = accepted;
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