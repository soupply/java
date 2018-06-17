package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CloseWindow extends soupply.java.Packet
{

    public static final int ID = 8;

    public byte window;

    public CloseWindow()
    {
    }

    public CloseWindow(byte window)
    {
        this.window = window;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readByte();
    }

    public static CloseWindow fromBuffer(byte[] buffer)
    {
        CloseWindow packet = new CloseWindow();
        packet.safeDecode(buffer);
        return packet;
    }

}
