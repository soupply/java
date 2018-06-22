package soupply.java316.protocol.status;

import java.util.*;
import soupply.util.*;

public class Handshake extends soupply.java316.Packet
{

    public static final int ID = 0;

    // next
    public static final int STATUS = (int)1;
    public static final int LOGIN = (int)2;

    public int protocol;
    public String serverAddress;
    public short serverPort;
    public int next;

    public Handshake()
    {
    }

    public Handshake(int protocol, String serverAddress, short serverPort, int next)
    {
        this.protocol = protocol;
        this.serverAddress = serverAddress;
        this.serverPort = serverPort;
        this.next = next;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(protocol);
        byte[] cvdvqrcv = _buffer.convertString(serverAddress);
        _buffer.writeVaruint((int)cvdvqrcv.length);
        _buffer.writeBytes(cvdvqrcv);
        _buffer.writeBigEndianShort(serverPort);
        _buffer.writeVaruint(next);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        protocol = _buffer.readVaruint();
        final int bvcvdvqr = _buffer.readVaruint();
        serverAddress = _buffer.readString(bvcvdvqr);
        serverPort = _buffer.readBigEndianShort();
        next = _buffer.readVaruint();
    }

    public static Handshake fromBuffer(byte[] buffer)
    {
        Handshake packet = new Handshake();
        packet.safeDecode(buffer);
        return packet;
    }

}
