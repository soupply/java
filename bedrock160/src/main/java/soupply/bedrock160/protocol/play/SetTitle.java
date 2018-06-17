package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetTitle extends soupply.bedrock160.Packet
{

    public static final int ID = 88;

    // action
    public static final int HIDE = (int)0;
    public static final int RESET = (int)1;
    public static final int SET_TITLE = (int)2;
    public static final int SET_SUBTITLE = (int)3;
    public static final int SET_ACTION_BAR = (int)4;
    public static final int SET_TIMINGS = (int)5;

    public int action;
    public String text;
    public int fadeIn;
    public int stay;
    public int fadeOut;

    public SetTitle()
    {
    }

    public SetTitle(int action, String text, int fadeIn, int stay, int fadeOut)
    {
        this.action = action;
        this.text = text;
        this.fadeIn = fadeIn;
        this.stay = stay;
        this.fadeOut = fadeOut;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarint(action);
        byte[] dvd = _buffer.convertString(text);
        _buffer.writeVaruint((int)dvd.length);
        _buffer.writeBytes(dvd);
        _buffer.writeVarint(fadeIn);
        _buffer.writeVarint(stay);
        _buffer.writeVarint(fadeOut);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVarint();
        final int bvdvd = _buffer.readVaruint();
        text = _buffer.readString(bvdvd);
        fadeIn = _buffer.readVarint();
        stay = _buffer.readVarint();
        fadeOut = _buffer.readVarint();
    }

    public static SetTitle fromBuffer(byte[] buffer)
    {
        SetTitle packet = new SetTitle();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
