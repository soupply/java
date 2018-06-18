package soupply.bedrock261.type;

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
        _buffer.writeLittleEndianInt((int)chain.length);
        _buffer.writeBytes(chain);
        _buffer.writeLittleEndianInt((int)clientData.length);
        _buffer.writeBytes(clientData);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bnyl = _buffer.readLittleEndianInt();
        chain = _buffer.readBytes(bnyl);
        final int bnavdrde = _buffer.readLittleEndianInt();
        clientData = _buffer.readBytes(bnavdrde);
    }

}
