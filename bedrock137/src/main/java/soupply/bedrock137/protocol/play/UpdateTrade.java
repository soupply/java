package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateTrade extends soupply.bedrock137.Packet
{

    public static final int ID = 80;

    public byte window;
    public byte windowType = 15;
    public int unknown2;
    public int unknown3;
    public boolean willing;
    public long trader;
    public long player;
    public String displayName;
    public byte[] offers;

    public UpdateTrade()
    {
    }

    public UpdateTrade(byte window, byte windowType, int unknown2, int unknown3, boolean willing, long trader, long player, String displayName, byte[] offers)
    {
        this.window = window;
        this.windowType = windowType;
        this.unknown2 = unknown2;
        this.unknown3 = unknown3;
        this.willing = willing;
        this.trader = trader;
        this.player = player;
        this.displayName = displayName;
        this.offers = offers;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeByte(windowType);
        _buffer.writeVarint(unknown2);
        _buffer.writeVarint(unknown3);
        _buffer.writeBool(willing);
        _buffer.writeVarlong(trader);
        _buffer.writeVarlong(player);
        byte[] zlcxe5bu = _buffer.convertString(displayName);
        _buffer.writeVaruint((int)zlcxe5bu.length);
        _buffer.writeBytes(zlcxe5bu);
        _buffer.writeBytes(offers);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readByte();
        windowType = _buffer.readByte();
        unknown2 = _buffer.readVarint();
        unknown3 = _buffer.readVarint();
        willing = _buffer.readBool();
        trader = _buffer.readVarlong();
        player = _buffer.readVarlong();
        final int bvzlcxe5 = _buffer.readVaruint();
        displayName = _buffer.readString(bvzlcxe5);
        offers = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static UpdateTrade fromBuffer(byte[] buffer)
    {
        UpdateTrade packet = new UpdateTrade();
        packet.safeDecode(buffer);
        return packet;
    }

}
