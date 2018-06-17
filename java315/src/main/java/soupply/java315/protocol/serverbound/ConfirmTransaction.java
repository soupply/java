package soupply.java315.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ConfirmTransaction extends soupply.java315.Packet
{

    public static final int ID = 5;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
