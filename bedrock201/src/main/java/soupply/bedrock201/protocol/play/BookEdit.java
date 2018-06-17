package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class BookEdit extends soupply.bedrock201.Packet
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
        _buffer.writeLittleEndianByte(type);
        _buffer.writeLittleEndianByte(slot);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readLittleEndianByte();
        slot = _buffer.readLittleEndianByte();
    }

    public static BookEdit fromBuffer(byte[] buffer)
    {
        BookEdit packet = new BookEdit();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
