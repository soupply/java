package soupply.bedrock150.type;

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
        Buffer _nbuffer = new Buffer();
        this.encodeBodyImpl(_nbuffer);
        _buffer.writeVaruint(_nbuffer._buffer.length);
        _buffer.writeBytes(_nbuffer.toByteArray());
    }

    private void encodeBodyImpl(Buffer _buffer)
    {
        _buffer.writeLittleEndianInt((int)chain.length);
        _buffer.writeBytes(chain);
        _buffer.writeLittleEndianInt((int)clientData.length);
        _buffer.writeBytes(clientData);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int _length = _buffer.readVaruint();
        this.decodeBodyImpl(new Buffer(_buffer.readBytes(_length)));
    }

    private void decodeBodyImpl(Buffer _buffer) throws BufferOverflowException
    {
        final int bnyl = _buffer.readLittleEndianInt();
        chain = _buffer.readBytes(bnyl);
        final int bnavdrde = _buffer.readLittleEndianInt();
        clientData = _buffer.readBytes(bnavdrde);
    }

}
