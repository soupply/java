package soupply.bedrock274.type;

import java.util.*;
import soupply.util.*;

public class Skin extends Type
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
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeVaruint((int)data.length);
        _buffer.writeBytes(data);
        _buffer.writeVaruint((int)capeData.length);
        _buffer.writeBytes(capeData);
        byte[] zvbvcly1 = _buffer.convertString(geometryName);
        _buffer.writeVaruint((int)zvbvcly1.length);
        _buffer.writeBytes(zvbvcly1);
        _buffer.writeVaruint((int)geometryData.length);
        _buffer.writeBytes(geometryData);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int brde = _buffer.readVaruint();
        data = _buffer.readBytes(brde);
        final int bncvyr = _buffer.readVaruint();
        capeData = _buffer.readBytes(bncvyr);
        final int bvzvbvcl = _buffer.readVaruint();
        geometryName = _buffer.readString(bvzvbvcl);
        final int bdb1djrf = _buffer.readVaruint();
        geometryData = _buffer.readBytes(bdb1djrf);
    }

}
