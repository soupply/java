package soupply.java335.clientbound;

import java.util.*;
import soupply.util.*;

class BlockAction extends soupply.java335.Packet
{

    // action
    public static final byte NOTE_BLOCK_HARP = 0;
    public static final byte NOTE_BLOCK_BASS_DRUM = 1;
    public static final byte NOTE_BLOCK_SNARE_DRUM = 2;
    public static final byte NOTE_BLOCK_CLICKS = 3;
    public static final byte NOTE_BLOCK_STICKS = 3;
    public static final byte NOTE_BLOCK_BASS_GUITAR = 4;
    public static final byte PISTON_EXTEND = 0;
    public static final byte PISTON_RETRACT = 1;
    public static final byte CHEST_WATCHERS = 1;
    public static final byte BEACON_RECALCULATE = 1;
    public static final byte MOB_SPAWNER_RESET_DELAY = 1;
    public static final byte END_GATEWAY_YELLOW_BEAM = 1;

    // parameter
    public static final byte PISTON_DOWN = 0;
    public static final byte PISTON_UP = 1;
    public static final byte PISTON_SOUTH = 2;
    public static final byte PISTON_WEST = 3;
    public static final byte PISTON_NORTH = 4;
    public static final byte PISTON_EAST = 5;

    public long position;
    public byte action;
    public byte parameter;
    public int blockType;

    public BlockAction()
    {
    }

    public BlockAction(long position, byte action, byte parameter, int blockType)
    {
        this.position = position;
        this.action = action;
        this.parameter = parameter;
        this.blockType = blockType;
    }

}
