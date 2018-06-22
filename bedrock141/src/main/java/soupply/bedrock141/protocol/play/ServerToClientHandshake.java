package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class ServerToClientHandshake extends soupply.bedrock141.Packet
{

    public static final int ID = 3;

    public String serverPublicKey;
    public byte[] token;

    public ServerToClientHandshake()
    {
    }

    public ServerToClientHandshake(String serverPublicKey, byte[] token)
    {
        this.serverPublicKey = serverPublicKey;
        this.token = token;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] cvdvuvbl = _buffer.convertString(serverPublicKey);
        _buffer.writeVaruint((int)cvdvuvbl.length);
        _buffer.writeBytes(cvdvuvbl);
        _buffer.writeVaruint((int)token.length);
        _buffer.writeBytes(token);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvcvdvuv = _buffer.readVaruint();
        serverPublicKey = _buffer.readString(bvcvdvuv);
        final int brav = _buffer.readVaruint();
        token = _buffer.readBytes(brav);
    }

    public static ServerToClientHandshake fromBuffer(byte[] buffer)
    {
        ServerToClientHandshake packet = new ServerToClientHandshake();
        packet.safeDecode(buffer);
        return packet;
    }

}
