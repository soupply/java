package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class BlockAction extends soupply.java335.Packet
{

    public static final int ID = 10;

    // action
    public static final byte NOTE_BLOCK_HARP = (byte)0;
    public static final byte NOTE_BLOCK_BASS_DRUM = (byte)1;
    public static final byte NOTE_BLOCK_SNARE_DRUM = (byte)2;
    public static final byte NOTE_BLOCK_CLICKS = (byte)3;
    public static final byte NOTE_BLOCK_STICKS = (byte)3;
    public static final byte NOTE_BLOCK_BASS_GUITAR = (byte)4;
    public static final byte PISTON_EXTEND = (byte)0;
    public static final byte PISTON_RETRACT = (byte)1;
    public static final byte CHEST_WATCHERS = (byte)1;
    public static final byte BEACON_RECALCULATE = (byte)1;
    public static final byte MOB_SPAWNER_RESET_DELAY = (byte)1;
    public static final byte END_GATEWAY_YELLOW_BEAM = (byte)1;

    // parameter
    public static final byte PISTON_DOWN = (byte)0;
    public static final byte PISTON_UP = (byte)1;
    public static final byte PISTON_SOUTH = (byte)2;
    public static final byte PISTON_WEST = (byte)3;
    public static final byte PISTON_NORTH = (byte)4;
    public static final byte PISTON_EAST = (byte)5;

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
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
