package soupply.java316.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class SetCooldown extends soupply.java316.Packet
{

    public static final int ID = 23;

    public int item;
    public int cooldown;

    public SetCooldown()
    {
    }

    public SetCooldown(int item, int cooldown)
    {
        this.item = item;
        this.cooldown = cooldown;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(item);
        _buffer.writeVaruint(cooldown);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        item = _buffer.readVaruint();
        cooldown = _buffer.readVaruint();
    }

    public static SetCooldown fromBuffer(byte[] buffer)
    {
        SetCooldown packet = new SetCooldown();
        packet.safeDecode(buffer);
        return packet;
    }

}
