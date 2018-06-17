package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CraftRecipeRequest extends soupply.java.Packet
{

    public static final int ID = 18;

    public byte window;
    public int recipe;
    public boolean makeAll;

    public CraftRecipeRequest()
    {
    }

    public CraftRecipeRequest(byte window, int recipe, boolean makeAll)
    {
        this.window = window;
        this.recipe = recipe;
        this.makeAll = makeAll;
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
        _buffer.writeBool(makeAll);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        window = _buffer.readByte();
        recipe = _buffer.readVaruint();
        makeAll = _buffer.readBool();
    }

    public static CraftRecipeRequest fromBuffer(byte[] buffer)
    {
        CraftRecipeRequest packet = new CraftRecipeRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
