package soupply.java338.status;

import java.util.*;
import soupply.util.*;

class Handshake extends soupply.java338.Packet
{

    // next
    public static final int STATUS = 1;
    public static final int LOGIN = 2;

    public int protocol = 338;
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

}
