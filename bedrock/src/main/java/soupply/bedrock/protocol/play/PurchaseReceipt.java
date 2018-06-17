package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class PurchaseReceipt extends soupply.bedrock.Packet
{

    public static final int ID = 92;

    public String[] unknown0;

    public PurchaseReceipt()
    {
    }

    public PurchaseReceipt(String[] unknown0)
    {
        this.unknown0 = unknown0;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)unknown0.length);
        for(String d5b9ba:unknown0)
        {
            byte[] zvoj = _buffer.convertString(d5b9ba);
            _buffer.writeVaruint((int)zvoj.length);
            _buffer.writeBytes(zvoj);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bva5d4 = _buffer.readVaruint();
        unknown0 = new String[bva5d4];
        for(int d5b9ba=0;d5b9ba<unknown0.length;d5b9ba++)
        {
            final int bvd5b9bb = _buffer.readVaruint();
            unknown0[d5b9ba] = _buffer.readString(bvd5b9bb);
        }
    }

    public static PurchaseReceipt fromBuffer(byte[] buffer)
    {
        PurchaseReceipt packet = new PurchaseReceipt();
        packet.safeDecode(buffer);
        return packet;
    }

}
