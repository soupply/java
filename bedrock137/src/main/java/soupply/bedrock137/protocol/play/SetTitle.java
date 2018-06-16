package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class SetTitle extends soupply.bedrock137.Packet
{

    public static final int ID = 88;

    // action
    public static final int HIDE = 0;
    public static final int RESET = 1;
    public static final int SET_TITLE = 2;
    public static final int SET_SUBTITLE = 3;
    public static final int SET_ACTION_BAR = 4;
    public static final int SET_TIMINGS = 5;

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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}
