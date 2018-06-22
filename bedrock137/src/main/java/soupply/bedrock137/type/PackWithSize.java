package soupply.bedrock137.type;

import java.util.*;
import soupply.util.*;

public class PackWithSize extends Type
{

    public String id;
    public String version;
    public long size;

    public PackWithSize()
    {
    }

    public PackWithSize(String id, String version, long size)
    {
        this.id = id;
        this.version = version;
        this.size = size;
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
        _buffer.writeLittleEndianLong(size);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        final int bvdvclb = _buffer.readVaruint();
        version = _buffer.readString(bvdvclb);
        size = _buffer.readLittleEndianLong();
    }

}
