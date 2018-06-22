package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Title extends soupply.java315.Packet
{

    public static final int ID = 69;

    public int action;

    public Title()
    {
    }

    public Title(int action)
    {
        this.action = action;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(action);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        action = _buffer.readVaruint();
    }

    public static Title fromBuffer(byte[] buffer)
    {
        Title packet = new Title();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class SetTitle extends Type
    {

        public String text;

        public SetTitle()
        {
        }

        public SetTitle(String text)
        {
            this.text = text;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 0;
            encodeMainBody(_buffer);
            byte[] dvd = _buffer.convertString(text);
            _buffer.writeVaruint((int)dvd.length);
            _buffer.writeBytes(dvd);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bvdvd = _buffer.readVaruint();
            text = _buffer.readString(bvdvd);
        }

    }

    public class SetSubtitle extends Type
    {

        public String text;

        public SetSubtitle()
        {
        }

        public SetSubtitle(String text)
        {
            this.text = text;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 1;
            encodeMainBody(_buffer);
            byte[] dvd = _buffer.convertString(text);
            _buffer.writeVaruint((int)dvd.length);
            _buffer.writeBytes(dvd);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bvdvd = _buffer.readVaruint();
            text = _buffer.readString(bvdvd);
        }

    }

    public class SetActionBar extends Type
    {

        public String text;

        public SetActionBar()
        {
        }

        public SetActionBar(String text)
        {
            this.text = text;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 2;
            encodeMainBody(_buffer);
            byte[] dvd = _buffer.convertString(text);
            _buffer.writeVaruint((int)dvd.length);
            _buffer.writeBytes(dvd);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            final int bvdvd = _buffer.readVaruint();
            text = _buffer.readString(bvdvd);
        }

    }

    public class SetTimings extends Type
    {

        public int fadeIn;
        public int stay;
        public int fadeOut;

        public SetTimings()
        {
        }

        public SetTimings(int fadeIn, int stay, int fadeOut)
        {
            this.fadeIn = fadeIn;
            this.stay = stay;
            this.fadeOut = fadeOut;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 3;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianInt(fadeIn);
            _buffer.writeBigEndianInt(stay);
            _buffer.writeBigEndianInt(fadeOut);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            fadeIn = _buffer.readBigEndianInt();
            stay = _buffer.readBigEndianInt();
            fadeOut = _buffer.readBigEndianInt();
        }

    }

    public class Hide extends Type
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 4;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
        }

    }

    public class Reset extends Type
    {

        @Override
        public void encodeBody(Buffer _buffer)
        {
            action = 5;
            encodeMainBody(_buffer);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
        }

    }

}
