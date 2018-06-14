package soupply.java338.serverbound;

import java.util.*;
import soupply.util.*;

class ClientSettings extends soupply.java338.Packet
{

    // chat mode
    public static final int ENABLED = 0;
    public static final int COMMANDS_ONLY = 1;
    public static final int DISABLED = 2;

    // displayed skin parts
    public static final byte CAPE = 1;
    public static final byte JACKET = 2;
    public static final byte LEFT_SLEEVE = 4;
    public static final byte RIGHT_SLEEVE = 8;
    public static final byte LEFT_PANTS = 16;
    public static final byte RIGHT_PANTS = 32;
    public static final byte HAT = 64;

    // main hand
    public static final byte RIGHT = 0;
    public static final byte LEFT = 1;

    public String language;
    public byte viewDistance;
    public int chatMode;
    public boolean chatColors;
    public byte displayedSkinParts;
    public byte mainHand;

    public ClientSettings()
    {
    }

    public ClientSettings(String language, byte viewDistance, int chatMode, boolean chatColors, byte displayedSkinParts, byte mainHand)
    {
        this.language = language;
        this.viewDistance = viewDistance;
        this.chatMode = chatMode;
        this.chatColors = chatColors;
        this.displayedSkinParts = displayedSkinParts;
        this.mainHand = mainHand;
    }

}
