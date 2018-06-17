package soupply.java316.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CloseWindow extends soupply.java316.Packet
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
        _buffer.writeBigEndianByte(window);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readBigEndianByte();
    }

    public static CloseWindow fromBuffer(byte[] buffer)
    {
        CloseWindow packet = new CloseWindow();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
