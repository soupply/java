package soupply.bedrock282.type;

import java.util.*;
import soupply.util.*;

public class PackWithSize extends Type
{

    public String id;
    public String version;
    public long size;
    public String unknown3;
    public String unknown4;

    public PackWithSize()
    {
    }

    public PackWithSize(String id, String version, long size, String unknown3, String unknown4)
    {
        this.id = id;
        this.version = version;
        this.size = size;
        this.unknown3 = unknown3;
        this.unknown4 = unknown4;
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
        byte[] d5b9bm = _buffer.convertString(unknown3);
        _buffer.writeVaruint((int)d5b9bm.length);
        _buffer.writeBytes(d5b9bm);
        byte[] d5b9bq = _buffer.convertString(unknown4);
        _buffer.writeVaruint((int)d5b9bq.length);
        _buffer.writeBytes(d5b9bq);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        final int bvdvclb = _buffer.readVaruint();
        version = _buffer.readString(bvdvclb);
        size = _buffer.readLittleEndianLong();
        final int bvd5b9bm = _buffer.readVaruint();
        unknown3 = _buffer.readString(bvd5b9bm);
        final int bvd5b9bq = _buffer.readVaruint();
        unknown4 = _buffer.readString(bvd5b9bq);
    }

}
