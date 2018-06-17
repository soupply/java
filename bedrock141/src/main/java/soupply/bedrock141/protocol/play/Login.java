package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class Login extends soupply.bedrock141.Packet
{

    public static final int ID = 1;

    public int protocol = 141;
    public soupply.bedrock141.type.LoginBody body;

    public Login()
    {
        this.body = new soupply.bedrock141.type.LoginBody();
    }

    public Login(int protocol, soupply.bedrock141.type.LoginBody body)
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
