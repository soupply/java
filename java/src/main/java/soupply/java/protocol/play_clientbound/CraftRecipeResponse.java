package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class CraftRecipeResponse extends soupply.java.Packet
{

    public static final int ID = 45;

    public byte window;
    public int recipe;

    public CraftRecipeResponse()
    {
    }

    public CraftRecipeResponse(byte window, int recipe)
    {
        this.window = window;
        this.recipe = recipe;
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
        _buffer.writeVaruint(recipe);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        recipe = _buffer.readVaruint();
    }

    public static CraftRecipeResponse fromBuffer(byte[] buffer)
    {
        CraftRecipeResponse packet = new CraftRecipeResponse();
        packet.safeDecode(buffer);
        return packet;
    }

}
