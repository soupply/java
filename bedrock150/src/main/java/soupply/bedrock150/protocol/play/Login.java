package soupply.bedrock150.protocol.play;

import java.util.*;
import soupply.util.*;

public class Login extends soupply.bedrock150.Packet
{

    public static final int ID = 1;

    public int protocol = 150;
    public soupply.bedrock150.type.LoginBody body;

    public Login()
    {
        this.body = new soupply.bedrock150.type.LoginBody();
    }

    public Login(int protocol, soupply.bedrock150.type.LoginBody body)
    {
        this.protocol = protocol;
        this.body = body;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianInt(protocol);
        body.encodeBody(_buffer);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        protocol = _buffer.readBigEndianInt();
        body.decodeBody(_buffer);
    }

    public static Login fromBuffer(byte[] buffer)
    {
        Login packet = new Login();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
