package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class DestroyEntities extends soupply.java.Packet
{

    public static final int ID = 53;

    public int[] entityIds;

    public DestroyEntities()
    {
    }

    public DestroyEntities(int[] entityIds)
    {
        this.entityIds = entityIds;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)entityIds.length);
        for(int z5arsr:entityIds)
        {
            _buffer.writeVaruint(z5arsr);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvdlelc = _buffer.readVaruint();
        entityIds = new int[bvdlelc];
        for(int z5arsr=0;z5arsr<entityIds.length;z5arsr++)
        {
            entityIds[z5arsr] = _buffer.readVaruint();
        }
    }

    public static DestroyEntities fromBuffer(byte[] buffer)
    {
        DestroyEntities packet = new DestroyEntities();
        packet.safeDecode(buffer);
        return packet;
    }

}
