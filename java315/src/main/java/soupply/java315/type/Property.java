package soupply.java315.type;

import java.util.*;
import soupply.util.*;

public class Property extends Type
{

    public String name;
    public String value;
    public boolean signed;
    public String signature;

    public Property()
    {
    }

    public Property(String name, String value, boolean signed, String signature)
    {
        this.name = name;
        this.value = value;
        this.signed = signed;
        this.signature = signature;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        byte[] dfdu = _buffer.convertString(value);
        _buffer.writeVaruint((int)dfdu.length);
        _buffer.writeBytes(dfdu);
        _buffer.writeBool(signed);
        byte[] clbfdj = _buffer.convertString(signature);
        _buffer.writeVaruint((int)clbfdj.length);
        _buffer.writeBytes(clbfdj);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int bvdfdu = _buffer.readVaruint();
        value = _buffer.readString(bvdfdu);
        signed = _buffer.readBool();
        final int bvclbfdj = _buffer.readVaruint();
        signature = _buffer.readString(bvclbfdj);
    }

}
