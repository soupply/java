package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class SetTitle extends soupply.bedrock150.Packet
{

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

}
