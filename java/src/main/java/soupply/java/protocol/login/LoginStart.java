package soupply.java.protocol.login;

import java.util.*;
import soupply.util.*;

public class LoginStart extends soupply.java.Packet
{

    public static final int ID = 0;

    public String username;

    public LoginStart()
    {
    }

    public LoginStart(String username)
    {
        this.username = username;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] dnc5bu = _buffer.convertString(username);
        _buffer.writeVaruint((int)dnc5bu.length);
        _buffer.writeBytes(dnc5bu);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvdnc5bu = _buffer.readVaruint();
        username = _buffer.readString(bvdnc5bu);
    }

    public static LoginStart fromBuffer(byte[] buffer)
    {
        LoginStart packet = new LoginStart();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
