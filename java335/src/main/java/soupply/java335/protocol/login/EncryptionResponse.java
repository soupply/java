package soupply.java335.protocol.login;

import java.util.*;
import soupply.util.*;

public class EncryptionResponse extends soupply.java335.Packet
{

    public static final int ID = 1;

    public byte[] sharedSecret;
    public byte[] verifyToken;

    public EncryptionResponse()
    {
    }

    public EncryptionResponse(byte[] sharedSecret, byte[] verifyToken)
    {
        this.sharedSecret = sharedSecret;
        this.verifyToken = verifyToken;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)sharedSecret.length);
        _buffer.writeBytes(sharedSecret);
        _buffer.writeVaruint((int)verifyToken.length);
        _buffer.writeBytes(verifyToken);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bnyjznyj = _buffer.readVaruint();
        sharedSecret = _buffer.readBytes(bnyjznyj);
        final int bzclerav = _buffer.readVaruint();
        verifyToken = _buffer.readBytes(bzclerav);
    }

    public static EncryptionResponse fromBuffer(byte[] buffer)
    {
        EncryptionResponse packet = new EncryptionResponse();
        packet.safeDecode(buffer);
        return packet;
    }

}
