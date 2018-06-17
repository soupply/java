package soupply.java210.protocol.login;

import java.util.*;
import soupply.util.*;

public class LoginSuccess extends soupply.java210.Packet
{

    public static final int ID = 2;

    public String uuid;
    public String username;

    public LoginSuccess()
    {
    }

    public LoginSuccess(String uuid, String username)
    {
        this.uuid = uuid;
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
        byte[] dvz = _buffer.convertString(uuid);
        _buffer.writeVaruint((int)dvz.length);
        _buffer.writeBytes(dvz);
        byte[] dnc5bu = _buffer.convertString(username);
        _buffer.writeVaruint((int)dnc5bu.length);
        _buffer.writeBytes(dnc5bu);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvdvz = _buffer.readVaruint();
        uuid = _buffer.readString(bvdvz);
        final int bvdnc5bu = _buffer.readVaruint();
        username = _buffer.readString(bvdnc5bu);
    }

    public static LoginSuccess fromBuffer(byte[] buffer)
    {
        LoginSuccess packet = new LoginSuccess();
        packet.safeDecode(buffer);
        return packet;
    }

}
