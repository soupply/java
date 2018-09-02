package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class MoveEntityDelta extends soupply.bedrock282.Packet
{

    public static final int ID = 111;

    // flags
    public static final byte HAS_DIFF_X = (byte)1;
    public static final byte HAS_DIFF_Y = (byte)2;
    public static final byte HAS_DIFF_Z = (byte)4;
    public static final byte HAS_ROT_X = (byte)8;
    public static final byte HAS_ROT_Y = (byte)16;
    public static final byte HAS_ROT_Z = (byte)32;

    public byte flags;
    public int xDiff;
    public int yDiff;
    public int zDiff;
    public byte xRot;
    public byte yRot;
    public byte zRot;

    public MoveEntityDelta()
    {
    }

    public MoveEntityDelta(byte flags, int xDiff, int yDiff, int zDiff, byte xRot, byte yRot, byte zRot)
    {
        this.flags = flags;
        this.xDiff = xDiff;
        this.yDiff = yDiff;
        this.zDiff = zDiff;
        this.xRot = xRot;
        this.yRot = yRot;
        this.zRot = zRot;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(flags);
        if((flags&1)!=0)
        {
            _buffer.writeVarint(xDiff);
        }
        if((flags&2)!=0)
        {
            _buffer.writeVarint(yDiff);
        }
        if((flags&4)!=0)
        {
            _buffer.writeVarint(zDiff);
        }
        if((flags&8)!=0)
        {
            _buffer.writeByte(xRot);
        }
        if((flags&16)!=0)
        {
            _buffer.writeByte(yRot);
        }
        if((flags&32)!=0)
        {
            _buffer.writeByte(zRot);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        flags = _buffer.readByte();
        if((flags&1)!=0)
        {
            xDiff = _buffer.readVarint();
        }
        if((flags&2)!=0)
        {
            yDiff = _buffer.readVarint();
        }
        if((flags&4)!=0)
        {
            zDiff = _buffer.readVarint();
        }
        if((flags&8)!=0)
        {
            xRot = _buffer.readByte();
        }
        if((flags&16)!=0)
        {
            yRot = _buffer.readByte();
        }
        if((flags&32)!=0)
        {
            zRot = _buffer.readByte();
        }
    }

    public static MoveEntityDelta fromBuffer(byte[] buffer)
    {
        MoveEntityDelta packet = new MoveEntityDelta();
        packet.safeDecode(buffer);
        return packet;
    }

}
