package soupply.java210.clientbound;

import java.util.*;
import soupply.util.*;

class UpdateBlockEntity extends soupply.java210.Packet
{

    // action
    public static final byte MOB_SPAWNER_DATA = 1;
    public static final byte COMMAND_BLOCK_TEXT = 2;
    public static final byte BEACON_POWERS = 3;
    public static final byte MOB_HEAD_DATA = 4;
    public static final byte FLOWER_POT_FLOWER = 5;
    public static final byte BANNER_DATA = 6;
    public static final byte STRUCTURE_DATA = 7;
    public static final byte END_GATEWAY_DESTINATION = 8;
    public static final byte SIGN_TEXT = 9;

    public long position;
    public byte action;
    public byte[] nbt;

    public UpdateBlockEntity()
    {
    }

    public UpdateBlockEntity(long position, byte action, byte[] nbt)
    {
        this.position = position;
        this.action = action;
        this.nbt = nbt;
    }

}
