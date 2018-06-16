package soupply.java.protocol.status;

import java.util.*;
import soupply.util.*;

class Handshake extends soupply.java.Packet
{

    public static final int ID = 0;

    // next
    public static final int STATUS = 1;
    public static final int LOGIN = 2;

    public int protocol = 340;
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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer)
    {
    }

}