package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UpdateHealth extends soupply.java315.Packet
{

    public static final int ID = 62;

    public float health;
    public int hunger;
    public float saturation;

    public UpdateHealth()
    {
    }

    public UpdateHealth(float health, int hunger, float saturation)
    {
        this.health = health;
        this.hunger = hunger;
        this.saturation = saturation;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianFloat(health);
        _buffer.writeVaruint(hunger);
        _buffer.writeBigEndianFloat(saturation);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        health = _buffer.readBigEndianFloat();
        hunger = _buffer.readVaruint();
        saturation = _buffer.readBigEndianFloat();
    }

    public static UpdateHealth fromBuffer(byte[] buffer)
    {
        UpdateHealth packet = new UpdateHealth();
        packet.safeDecode(buffer);
        return packet;
    }

}
