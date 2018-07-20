package soupply.java.type;

import java.util.*;
import soupply.util.*;

public class Recipe extends Type
{

    public int recipeId;

    public Recipe()
    {
    }

    public Recipe(int recipeId)
    {
        this.recipeId = recipeId;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(recipeId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        recipeId = _buffer.readVaruint();
    }

}
