package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UpdateBlockEntity extends soupply.java338.Packet
{

    public static final int ID = 9;

    // action
    public static final byte MOB_SPAWNER_DATA = (byte)1;
    public static final byte COMMAND_BLOCK_TEXT = (byte)2;
    public static final byte BEACON_POWERS = (byte)3;
    public static final byte MOB_HEAD_DATA = (byte)4;
    public static final byte FLOWER_POT_FLOWER = (byte)5;
    public static final byte BANNER_DATA = (byte)6;
    public static final byte STRUCTURE_DATA = (byte)7;
    public static final byte END_GATEWAY_DESTINATION = (byte)8;
    public static final byte SIGN_TEXT = (byte)9;
    public static final byte SHULKER_BOX_DECLARATION = (byte)10;
    public static final byte BED_COLOR = (byte)11;

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
