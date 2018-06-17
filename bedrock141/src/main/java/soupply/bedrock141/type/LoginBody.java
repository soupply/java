package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

public class LoginBody extends Type
{

    public byte[] chain;
    public byte[] clientData;

    public LoginBody()
    {
    }

    public LoginBody(byte[] chain, byte[] clientData)
    {
        this.chain = chain;
        this.clientData = clientData;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)chain.length);
        _buffer.writeBytes(chain);
        _buffer.writeVaruint((int)clientData.length);
        _buffer.writeBytes(clientData);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bnyl = _buffer.readVaruint();
        chain = _buffer.readBytes(bnyl);
        final int bnavdrde = _buffer.readVaruint();
        clientData = _buffer.readBytes(bnavdrde);
    }

}
