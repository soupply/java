package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class Disconnect extends soupply.bedrock.Packet
{

    public static final int ID = 5;

    public boolean hideDisconnectionScreen;
    public String message;

    public Disconnect()
    {
    }

    public Disconnect(boolean hideDisconnectionScreen, String message)
    {
        this.hideDisconnectionScreen = hideDisconnectionScreen;
        this.message = message;
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
