package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class BookEdit extends soupply.bedrock.Packet
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
    public void decodeBody(Buffer _buffer) throws DecodeException
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

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class ReplacePage extends Type
    {

        public byte pageNumber;
        public String unknown1;
        public String unknown2;

        public ReplacePage()
        {
        }

        public ReplacePage(byte pageNumber, String unknown1, String unknown2)
        {
            this.pageNumber = pageNumber;
            this.unknown1 = unknown1;
            this.unknown2 = unknown2;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 0;
            encodeMainBody(_buffer);
            _buffer.writeByte(pageNumber);
            byte[] d5b9be = _buffer.convertString(unknown1);
            _buffer.writeVaruint((int)d5b9be.length);
            _buffer.writeBytes(d5b9be);
            byte[] d5b9bi = _buffer.convertString(unknown2);
            _buffer.writeVaruint((int)d5b9bi.length);
            _buffer.writeBytes(d5b9bi);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            pageNumber = _buffer.readByte();
            final int bvd5b9be = _buffer.readVaruint();
            unknown1 = _buffer.readString(bvd5b9be);
            final int bvd5b9bi = _buffer.readVaruint();
            unknown2 = _buffer.readString(bvd5b9bi);
        }

    }

    public class AddPage extends Type
    {

        public byte pageNumber;
        public String unknown1;
        public String unknown2;

        public AddPage()
        {
        }

        public AddPage(byte pageNumber, String unknown1, String unknown2)
        {
            this.pageNumber = pageNumber;
            this.unknown1 = unknown1;
            this.unknown2 = unknown2;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 1;
            encodeMainBody(_buffer);
            _buffer.writeByte(pageNumber);
            byte[] d5b9be = _buffer.convertString(unknown1);
            _buffer.writeVaruint((int)d5b9be.length);
            _buffer.writeBytes(d5b9be);
            byte[] d5b9bi = _buffer.convertString(unknown2);
            _buffer.writeVaruint((int)d5b9bi.length);
            _buffer.writeBytes(d5b9bi);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            pageNumber = _buffer.readByte();
            final int bvd5b9be = _buffer.readVaruint();
            unknown1 = _buffer.readString(bvd5b9be);
            final int bvd5b9bi = _buffer.readVaruint();
            unknown2 = _buffer.readString(bvd5b9bi);
        }

    }

    public class DeletePage extends Type
    {

        public byte pageNumber;

        public DeletePage()
        {
        }

        public DeletePage(byte pageNumber)
        {
            this.pageNumber = pageNumber;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 2;
            encodeMainBody(_buffer);
            _buffer.writeByte(pageNumber);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            pageNumber = _buffer.readByte();
        }

    }

    public class SwapPages extends Type
    {

        public byte page1;
        public byte page2;

        public SwapPages()
        {
        }

        public SwapPages(byte page1, byte page2)
        {
            this.page1 = page1;
            this.page2 = page2;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 3;
            encodeMainBody(_buffer);
            _buffer.writeByte(page1);
            _buffer.writeByte(page2);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            page1 = _buffer.readByte();
            page2 = _buffer.readByte();
        }

    }

    public class Sign extends Type
    {

        public String title;
        public String author;

        public Sign()
        {
        }

        public Sign(String title, String author)
        {
            this.title = title;
            this.author = author;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 4;
            encodeMainBody(_buffer);
            byte[] dlbu = _buffer.convertString(title);
            _buffer.writeVaruint((int)dlbu.length);
            _buffer.writeBytes(dlbu);
            byte[] yva9 = _buffer.convertString(author);
            _buffer.writeVaruint((int)yva9.length);
            _buffer.writeBytes(yva9);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bvdlbu = _buffer.readVaruint();
            title = _buffer.readString(bvdlbu);
            final int bvyva9 = _buffer.readVaruint();
            author = _buffer.readString(bvyva9);
        }

    }

}
