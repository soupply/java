package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerInput extends soupply.bedrock137.Packet
{

    public static final int ID = 57;

    public float sideways;
    public float forward;
    public boolean unknown2;
    public boolean unknown3;

    public PlayerInput()
    {
    }

    public PlayerInput(float sideways, float forward, boolean unknown2, boolean unknown3)
    {
        this.sideways = sideways;
        this.forward = forward;
        this.unknown2 = unknown2;
        this.unknown3 = unknown3;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianFloat(sideways);
        _buffer.writeLittleEndianFloat(forward);
        _buffer.writeBool(unknown2);
        _buffer.writeBool(unknown3);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        sideways = _buffer.readLittleEndianFloat();
        forward = _buffer.readLittleEndianFloat();
        unknown2 = _buffer.readBool();
        unknown3 = _buffer.readBool();
    }

    public static PlayerInput fromBuffer(byte[] buffer)
    {
        PlayerInput packet = new PlayerInput();
        packet.safeDecode(buffer);
        return packet;
    }

}
