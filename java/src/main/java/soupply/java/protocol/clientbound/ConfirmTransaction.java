package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ConfirmTransaction extends soupply.java.Packet
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
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeBigEndianShort(action);
        _buffer.writeBool(accepted);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        action = _buffer.readBigEndianShort();
        accepted = _buffer.readBool();
    }

    public static ConfirmTransaction fromBuffer(byte[] buffer)
    {
        ConfirmTransaction packet = new ConfirmTransaction();
        packet.safeDecode(buffer);
        return packet;
    }

}
