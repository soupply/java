package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class RecipeBookData extends soupply.java.Packet
{

    public static final int ID = 27;

    public int type;

    public RecipeBookData()
    {
    }

    public RecipeBookData(int type)
    {
        this.type = type;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        type = _buffer.readVaruint();
    }

    public static RecipeBookData fromBuffer(byte[] buffer)
    {
        RecipeBookData packet = new RecipeBookData();
        packet.safeDecode(buffer);
        return packet;
    }

    private void encodeMainBody(Buffer _buffer)
    {
        this.encodeBody(_buffer);
    }

    public class DisplayedRecipe extends Type
    {

        public int id;

        public DisplayedRecipe()
        {
        }

        public DisplayedRecipe(int id)
        {
            this.id = id;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 1;
            encodeMainBody(_buffer);
            _buffer.writeBigEndianInt(id);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            id = _buffer.readBigEndianInt();
        }

    }

    public class CraftingBookStatus extends Type
    {

        public boolean craftingRecipeBookOpened;
        public boolean craftingRecipeFilterActive;
        public boolean smeltingRecipeBookOpened;
        public boolean smeltingRecipeFilterActive;

        public CraftingBookStatus()
        {
        }

        public CraftingBookStatus(boolean craftingRecipeBookOpened, boolean craftingRecipeFilterActive, boolean smeltingRecipeBookOpened, boolean smeltingRecipeFilterActive)
        {
            this.craftingRecipeBookOpened = craftingRecipeBookOpened;
            this.craftingRecipeFilterActive = craftingRecipeFilterActive;
            this.smeltingRecipeBookOpened = smeltingRecipeBookOpened;
            this.smeltingRecipeFilterActive = smeltingRecipeFilterActive;
        }

        @Override
        public void encodeBody(Buffer _buffer)
        {
            type = 2;
            encodeMainBody(_buffer);
            _buffer.writeBool(craftingRecipeBookOpened);
            _buffer.writeBool(craftingRecipeFilterActive);
            _buffer.writeBool(smeltingRecipeBookOpened);
            _buffer.writeBool(smeltingRecipeFilterActive);
        }

        @Override
        public void decodeBody(Buffer _buffer) throws DecodeException
        {
            craftingRecipeBookOpened = _buffer.readBool();
            craftingRecipeFilterActive = _buffer.readBool();
            smeltingRecipeBookOpened = _buffer.readBool();
            smeltingRecipeFilterActive = _buffer.readBool();
        }

    }

}
