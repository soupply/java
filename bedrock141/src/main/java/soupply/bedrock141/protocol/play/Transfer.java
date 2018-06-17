package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

public class Transfer extends soupply.bedrock141.Packet
{

    public static final int ID = 85;

    public String ip;
    public short port = 19132;

    public Transfer()
    {
    }

    public Transfer(String ip, short port)
    {
        this.ip = ip;
        this.port = port;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] aa = _buffer.convertString(ip);
        _buffer.writeVaruint((int)aa.length);
        _buffer.writeBytes(aa);
        _buffer.writeLittleEndianShort(port);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvaa = _buffer.readVaruint();
        ip = _buffer.readString(bvaa);
        port = _buffer.readLittleEndianShort();
    }

    public static Transfer fromBuffer(byte[] buffer)
    {
        Transfer packet = new Transfer();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
