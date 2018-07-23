package soupply.bedrock274.protocol.play;

import java.util.*;
import soupply.util.*;

public class RemoveObject extends soupply.bedrock274.Packet
{

    public static final int ID = 106;

    public String objectName;

    public RemoveObject()
    {
    }

    public RemoveObject(String objectName)
    {
        this.objectName = objectName;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bjzntfz = _buffer.convertString(objectName);
        _buffer.writeVaruint((int)bjzntfz.length);
        _buffer.writeBytes(bjzntfz);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbjzntf = _buffer.readVaruint();
        objectName = _buffer.readString(bvbjzntf);
    }

    public static RemoveObject fromBuffer(byte[] buffer)
    {
        RemoveObject packet = new RemoveObject();
        packet.safeDecode(buffer);
        return packet;
    }

}
