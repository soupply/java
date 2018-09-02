package soupply.bedrock282.type;

import java.util.*;
import soupply.util.*;

public class Pack extends Type
{

    public String id;
    public String version;
    public String unknown2;

    public Pack()
    {
    }

    public Pack(String id, String version, String unknown2)
    {
        this.id = id;
        this.version = version;
        this.unknown2 = unknown2;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] arz = _buffer.convertString(id);
        _buffer.writeVaruint((int)arz.length);
        _buffer.writeBytes(arz);
        byte[] dvclb = _buffer.convertString(version);
        _buffer.writeVaruint((int)dvclb.length);
        _buffer.writeBytes(dvclb);
        byte[] d5b9bi = _buffer.convertString(unknown2);
        _buffer.writeVaruint((int)d5b9bi.length);
        _buffer.writeBytes(d5b9bi);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        final int bvdvclb = _buffer.readVaruint();
        version = _buffer.readString(bvdvclb);
        final int bvd5b9bi = _buffer.readVaruint();
        unknown2 = _buffer.readString(bvd5b9bi);
    }

}
