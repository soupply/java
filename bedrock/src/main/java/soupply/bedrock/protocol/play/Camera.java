package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class Camera extends soupply.bedrock.Packet
{

    public static final int ID = 73;

    public long unknown0;
    public long unknown1;

    public Camera()
    {
    }

    public Camera(long unknown0, long unknown1)
    {
        this.unknown0 = unknown0;
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
        _buffer.writeVarlong(unknown0);
        _buffer.writeVarlong(unknown1);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        unknown0 = _buffer.readVarlong();
        unknown1 = _buffer.readVarlong();
    }

    public static Camera fromBuffer(byte[] buffer)
    {
        Camera packet = new Camera();
        packet.safeDecode(buffer);
        return packet;
    }

}
