package soupply.java315.protocol.login;

import java.util.*;
import soupply.util.*;

public class EncryptionRequest extends soupply.java315.Packet
{

    public static final int ID = 1;

    public String serverId;
    public byte[] publicKey;
    public byte[] verifyToken;

    public EncryptionRequest()
    {
    }

    public EncryptionRequest(String serverId, byte[] publicKey, byte[] verifyToken)
    {
        this.serverId = serverId;
        this.publicKey = publicKey;
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
        byte[] cvdvsq = _buffer.convertString(serverId);
        _buffer.writeVaruint((int)cvdvsq.length);
        _buffer.writeBytes(cvdvsq);
        _buffer.writeVaruint((int)publicKey.length);
        _buffer.writeBytes(publicKey);
        _buffer.writeVaruint((int)verifyToken.length);
        _buffer.writeBytes(verifyToken);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvcvdvsq = _buffer.readVaruint();
        serverId = _buffer.readString(bvcvdvsq);
        final int bbyxyte = _buffer.readVaruint();
        publicKey = _buffer.readBytes(bbyxyte);
        final int bzclerav = _buffer.readVaruint();
        verifyToken = _buffer.readBytes(bzclerav);
    }

    public static EncryptionRequest fromBuffer(byte[] buffer)
    {
        EncryptionRequest packet = new EncryptionRequest();
        packet.safeDecode(buffer);
        return packet;
    }

}
