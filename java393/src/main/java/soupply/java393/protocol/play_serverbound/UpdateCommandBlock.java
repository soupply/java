package soupply.java393.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class UpdateCommandBlock extends soupply.java393.Packet
{

    public static final int ID = 34;

    // mode
    public static final int SEQUENCE = (int)0;
    public static final int AUTO = (int)1;
    public static final int REDSTONE = (int)2;

    // flags
    public static final byte TRACK_OUTPUT = (byte)1;
    public static final byte CONDITIONAL = (byte)2;
    public static final byte AUTOMATIC = (byte)4;

    public long location;
    public String command;
    public int mode;
    public byte flags;

    public UpdateCommandBlock()
    {
    }

    public UpdateCommandBlock(long location, String command, int mode, byte flags)
    {
        this.location = location;
        this.command = command;
        this.mode = mode;
        this.flags = flags;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(location);
        byte[] y9bfz = _buffer.convertString(command);
        _buffer.writeVaruint((int)y9bfz.length);
        _buffer.writeBytes(y9bfz);
        _buffer.writeVaruint(mode);
        _buffer.writeByte(flags);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        location = _buffer.readBigEndianLong();
        final int bvy9bfz = _buffer.readVaruint();
        command = _buffer.readString(bvy9bfz);
        mode = _buffer.readVaruint();
        flags = _buffer.readByte();
    }

    public static UpdateCommandBlock fromBuffer(byte[] buffer)
    {
        UpdateCommandBlock packet = new UpdateCommandBlock();
        packet.safeDecode(buffer);
        return packet;
    }

}
