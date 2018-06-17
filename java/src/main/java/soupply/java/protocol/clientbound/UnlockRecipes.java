package soupply.java.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UnlockRecipes extends soupply.java.Packet
{

    public static final int ID = 49;

    // action
    public static final int ADD = (int)1;
    public static final int REMOVE = (int)2;
    public static final int ADD_WITHOUT_NOTIFICATION = (int)3;

    public int action;
    public boolean openBook;
    public boolean filtering;
    public int[] recipes;
    public int[] bookRecipes;

    public UnlockRecipes()
    {
    }

    public UnlockRecipes(int action, boolean openBook, boolean filtering, int[] recipes, int[] bookRecipes)
    {
        this.action = action;
        this.openBook = openBook;
        this.filtering = filtering;
        this.recipes = recipes;
        this.bookRecipes = bookRecipes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(action);
        _buffer.writeBool(openBook);
        _buffer.writeBool(filtering);
        _buffer.writeVaruint((int)recipes.length);
        for(int cvabc:recipes)
        {
            _buffer.writeVaruint(cvabc);
        }
        _buffer.writeVaruint((int)bookRecipes.length);
        for(int y9ajylzm:bookRecipes)
        {
            _buffer.writeVaruint(y9ajylzm);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        action = _buffer.readVaruint();
        openBook = _buffer.readBool();
        filtering = _buffer.readBool();
        final int bjylzm = _buffer.readVaruint();
        recipes = new int[bjylzm];
        for(int cvabc=0;cvabc<recipes.length;cvabc++)
        {
            recipes[cvabc] = _buffer.readVaruint();
        }
        final int bjbtzncv = _buffer.readVaruint();
        bookRecipes = new int[bjbtzncv];
        for(int y9ajylzm=0;y9ajylzm<bookRecipes.length;y9ajylzm++)
        {
            bookRecipes[y9ajylzm] = _buffer.readVaruint();
        }
    }

    public static UnlockRecipes fromBuffer(byte[] buffer)
    {
        UnlockRecipes packet = new UnlockRecipes();
        packet.safeDecode(buffer);
        return packet;
    }

}
