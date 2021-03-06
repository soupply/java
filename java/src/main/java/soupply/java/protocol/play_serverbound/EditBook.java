package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class EditBook extends soupply.java.Packet
{

    public static final int ID = 11;

    public soupply.java.type.Slot newBook;
    public boolean signing;

    public EditBook()
    {
        this.newBook = new soupply.java.type.Slot();
    }

    public EditBook(soupply.java.type.Slot newBook, boolean signing)
    {
        this.newBook = newBook;
        this.signing = signing;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        newBook.encodeBody(_buffer);
        _buffer.writeBool(signing);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        newBook.decodeBody(_buffer);
        signing = _buffer.readBool();
    }

    public static EditBook fromBuffer(byte[] buffer)
    {
        EditBook packet = new EditBook();
        packet.safeDecode(buffer);
        return packet;
    }

}
