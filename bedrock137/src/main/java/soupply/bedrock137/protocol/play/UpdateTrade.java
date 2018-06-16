package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateTrade extends soupply.bedrock137.Packet
{

    public static final int ID = 80;

    public byte window;
    public byte windowType = 15;
    public int unknown2;
    public int unknown3;
    public boolean willing;
    public long trader;
    public long player;
    public String displayName;
    public byte[] offers;

    public UpdateTrade()
    {
    }

    public UpdateTrade(byte window, byte windowType, int unknown2, int unknown3, boolean willing, long trader, long player, String displayName, byte[] offers)
    {
        this.window = window;
        this.windowType = windowType;
        this.unknown2 = unknown2;
        this.unknown3 = unknown3;
        this.willing = willing;
        this.trader = trader;
        this.player = player;
        this.displayName = displayName;
        this.offers = offers;
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
