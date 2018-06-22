package soupply.java340.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class ChangeGameState extends soupply.java340.Packet
{

    public static final int ID = 30;

    // reason
    public static final byte INVALID_BED = (byte)0;
    public static final byte END_RAINING = (byte)1;
    public static final byte BEGIN_RAINING = (byte)2;
    public static final byte CHANGE_GAMEMODE = (byte)3;
    public static final byte EXIT_END = (byte)4;
    public static final byte DEMO_MESSAGE = (byte)5;
    public static final byte ARROW_HITTING_PLAYER = (byte)6;
    public static final byte FADE_VALUE = (byte)7;
    public static final byte FADE_TIME = (byte)8;
    public static final byte PLAY_ELDER_GUARDIAN_MOB_APPEARANCE = (byte)10;

    // value
    public static final float SURVIVAL = (float)0;
    public static final float CREATIVE = (float)1;
    public static final float ADVENTURE = (float)2;
    public static final float SPECTATOR = (float)3;
    public static final float RESPAWN_IMMEDIATELY = (float)0;
    public static final float RESPAWN_AFTER_CREDITS = (float)1;
    public static final float SHOW_DEMO_SCREEN = (float)0;
    public static final float TELL_MOVEMENT_CONTROLS = (float)101;
    public static final float TELL_JUMP_CONTROLS = (float)102;
    public static final float TELL_INVENTORY_CONTROLS = (float)103;
    public static final float BRIGHT = (float)0;
    public static final float DARK = (float)1;

    public byte reason;
    public float value;

    public ChangeGameState()
    {
    }

    public ChangeGameState(byte reason, float value)
    {
        this.reason = reason;
        this.value = value;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(reason);
        _buffer.writeBigEndianFloat(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        reason = _buffer.readByte();
        value = _buffer.readBigEndianFloat();
    }

    public static ChangeGameState fromBuffer(byte[] buffer)
    {
        ChangeGameState packet = new ChangeGameState();
        packet.safeDecode(buffer);
        return packet;
    }

}
