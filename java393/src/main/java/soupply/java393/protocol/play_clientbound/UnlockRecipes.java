package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class UnlockRecipes extends soupply.java393.Packet
{

    public static final int ID = 52;

    // action
    public static final int ADD = (int)1;
    public static final int REMOVE = (int)2;
    public static final int ADD_WITHOUT_NOTIFICATION = (int)3;

    public int action;
    public boolean craftingRecipeBookOpen;
    public boolean craftingRecipeBookFilterActive;
    public boolean smeltingRecipeBookOpen;
    public boolean smeltingRecipeBookFilterActive;
    public int[] recipes;
    public int[] bookRecipes;

    public UnlockRecipes()
    {
    }

    public UnlockRecipes(int action, boolean craftingRecipeBookOpen, boolean craftingRecipeBookFilterActive, boolean smeltingRecipeBookOpen, boolean smeltingRecipeBookFilterActive, int[] recipes, int[] bookRecipes)
    {
        this.action = action;
        this.craftingRecipeBookOpen = craftingRecipeBookOpen;
        this.craftingRecipeBookFilterActive = craftingRecipeBookFilterActive;
        this.smeltingRecipeBookOpen = smeltingRecipeBookOpen;
        this.smeltingRecipeBookFilterActive = smeltingRecipeBookFilterActive;
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
        _buffer.writeBool(craftingRecipeBookOpen);
        _buffer.writeBool(craftingRecipeBookFilterActive);
        _buffer.writeBool(smeltingRecipeBookOpen);
        _buffer.writeBool(smeltingRecipeBookFilterActive);
        _buffer.writeVaruint((int)recipes.length);
        for(int cvabc:recipes)
        {
            _buffer.writeVaruint(cvabc);
        }
        if(action==1||action==3)
        {
            _buffer.writeVaruint((int)bookRecipes.length);
            for(int y9ajylzm:bookRecipes)
            {
                _buffer.writeVaruint(y9ajylzm);
            }
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        action = _buffer.readVaruint();
        craftingRecipeBookOpen = _buffer.readBool();
        craftingRecipeBookFilterActive = _buffer.readBool();
        smeltingRecipeBookOpen = _buffer.readBool();
        smeltingRecipeBookFilterActive = _buffer.readBool();
        final int bjylzm = _buffer.readVaruint();
        recipes = new int[bjylzm];
        for(int cvabc=0;cvabc<recipes.length;cvabc++)
        {
            recipes[cvabc] = _buffer.readVaruint();
        }
        if(action==1||action==3)
        {
            final int bjbtzncv = _buffer.readVaruint();
            bookRecipes = new int[bjbtzncv];
            for(int y9ajylzm=0;y9ajylzm<bookRecipes.length;y9ajylzm++)
            {
                bookRecipes[y9ajylzm] = _buffer.readVaruint();
            }
        }
    }

    public static UnlockRecipes fromBuffer(byte[] buffer)
    {
        UnlockRecipes packet = new UnlockRecipes();
        packet.safeDecode(buffer);
        return packet;
    }

}
