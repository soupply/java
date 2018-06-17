package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Camera extends soupply.java335.Packet
{

    public static final int ID = 56;

    public int entityId;

    public Camera()
    {
    }

    public Camera(int entityId)
    {
        this.entityId = entityId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVaruint();
    }

    public static Camera fromBuffer(byte[] buffer)
    {
        Camera packet = new Camera();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
