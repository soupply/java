package soupply.java340.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CraftingBookData extends soupply.java340.Packet
{

    public static final int ID = 23;

    public int type;

    public CraftingBookData()
    {
    }

    public CraftingBookData(int type)
    {
        this.type = type;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readVaruint();
    }

    public static CraftingBookData fromBuffer(byte[] buffer)
    {
        CraftingBookData packet = new CraftingBookData();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class DisplayedRecipe extends Type
    {

        public int id;

        public DisplayedRecipe()
        {
        }

        public DisplayedRecipe(int id)
        {
            this.id = id;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 1;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianInt(id);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            id = _buffer.readBigEndianInt();
        }

    }

    public class CraftingBookStatus extends Type
    {

        public boolean bookOpened;
        public boolean filtering;

        public CraftingBookStatus()
        {
        }

        public CraftingBookStatus(boolean bookOpened, boolean filtering)
        {
            this.bookOpened = bookOpened;
            this.filtering = filtering;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 2;
            encodeMainBody(_buffer);
            _buffer.writeBool(bookOpened);
            _buffer.writeBool(filtering);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws BufferOverflowException
        {
            bookOpened = _buffer.readBool();
            filtering = _buffer.readBool();
        }

    }

}
