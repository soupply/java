package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateAttributes extends soupply.bedrock137.Packet
{

    public static final int ID = 29;

    public long entityId;
    public soupply.bedrock137.type.Attribute[] attributes;

    public UpdateAttributes()
    {
    }

    public UpdateAttributes(long entityId, soupply.bedrock137.type.Attribute[] attributes)
    {
        this.entityId = entityId;
        this.attributes = attributes;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(entityId);
        _buffer.writeVaruint((int)attributes.length);
        for(soupply.bedrock137.type.Attribute yrcldrc:attributes)
        {
            yrcldrc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        entityId = _buffer.readVarlong();
        final int bfdjyvzm = _buffer.readVaruint();
        for(int yrcldrc=0;yrcldrc<attributes.length;yrcldrc++)
        {
            attributes[yrcldrc].decodeBody(_buffer);
        }
    }

    public static UpdateAttributes fromBuffer(byte[] buffer)
    {
        UpdateAttributes packet = new UpdateAttributes();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
