package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class ConfirmTransaction extends soupply.java338.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianByte(window);
        _buffer.writeBigEndianShort(action);
        _buffer.writeBool(accepted);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readBigEndianByte();
        action = _buffer.readBigEndianShort();
        accepted = _buffer.readBool();
    }

    public static ConfirmTransaction fromBuffer(byte[] buffer)
    {
        ConfirmTransaction packet = new ConfirmTransaction();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
