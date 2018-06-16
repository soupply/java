package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

class Skin extends Type
{

    public String name;
    public byte[] data;
    public byte[] capeData;
    public String geometryName;
    public byte[] geometryData;

    public Skin()
    {
    }

    public Skin(String name, byte[] data, byte[] capeData, String geometryName, byte[] geometryData)
    {
        this.name = name;
        this.data = data;
        this.capeData = capeData;
        this.geometryName = geometryName;
        this.geometryData = geometryData;
    }

    @Override
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}