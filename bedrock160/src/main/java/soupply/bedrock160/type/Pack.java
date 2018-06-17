package soupply.bedrock160.type;

import java.util.*;
import soupply.util.*;

public class Pack extends Type
{

    public String id;
    public String version;

    public Pack()
    {
    }

    public Pack(String id, String version)
    {
        this.id = id;
        this.version = version;
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
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvaq = _buffer.readVaruint();
        id = _buffer.readString(bvaq);
        final int bvdvclb = _buffer.readVaruint();
        version = _buffer.readString(bvdvclb);
    }

}
