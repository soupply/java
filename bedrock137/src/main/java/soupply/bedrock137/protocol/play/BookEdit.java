package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class BookEdit extends soupply.bedrock137.Packet
{

    public static final int ID = 97;

    public byte type;
    public byte slot;

    public BookEdit()
    {
    }

    public BookEdit(byte type, byte slot)
    {
        this.type = type;
        this.slot = slot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(type);
        _buffer.writeByte(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readByte();
        slot = _buffer.readByte();
    }

    public static BookEdit fromBuffer(byte[] buffer)
    {
        BookEdit packet = new BookEdit();
        packet.safeDecode(buffer);
        return packet;
    }

}
