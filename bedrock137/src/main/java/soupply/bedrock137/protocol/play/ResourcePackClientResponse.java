package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class ResourcePackClientResponse extends soupply.bedrock137.Packet
{

    public static final int ID = 8;

    // status
    public static final byte REFUSED = (byte)1;
    public static final byte SEND_PACKS = (byte)2;
    public static final byte HAVE_ALL_PACKS = (byte)3;
    public static final byte COMPLETED = (byte)4;

    public byte status;
    public String[] packIds;

    public ResourcePackClientResponse()
    {
    }

    public ResourcePackClientResponse(byte status, String[] packIds)
    {
        this.status = status;
        this.packIds = packIds;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(status);
        _buffer.writeLittleEndianShort((short)packIds.length);
        for(String cfalc:packIds)
        {
            byte[] yzbm = _buffer.convertString(cfalc);
            _buffer.writeVaruint((int)yzbm.length);
            _buffer.writeBytes(yzbm);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        status = _buffer.readByte();
        final int bbytzm = _buffer.readLittleEndianShort();
        packIds = new String[bbytzm];
        for(int cfalc=0;cfalc<packIds.length;cfalc++)
        {
            final int bvcfalct = _buffer.readVaruint();
            packIds[cfalc] = _buffer.readString(bvcfalct);
        }
    }

    public static ResourcePackClientResponse fromBuffer(byte[] buffer)
    {
        ResourcePackClientResponse packet = new ResourcePackClientResponse();
        packet.safeDecode(buffer);
        return packet;
    }

}
