package soupply.bedrock201.protocol.play;

import java.util.*;
import soupply.util.*;

public class Text extends soupply.bedrock201.Packet
{

    public static final int ID = 9;

    public byte type;
    public boolean unknown1;

    public Text()
    {
    }

    public Text(byte type, boolean unknown1)
    {
        this.type = type;
        this.unknown1 = unknown1;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(type);
        _buffer.writeBool(unknown1);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readByte();
        unknown1 = _buffer.readBool();
    }

    public static Text fromBuffer(byte[] buffer)
    {
        Text packet = new Text();
        packet.safeDecode(buffer);
        return packet;
    }

}
