package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class NbtQueryResponse extends soupply.java.Packet
{

    public static final int ID = 29;

    public int transactionId;
    public byte[] nbt;

    public NbtQueryResponse()
    {
    }

    public NbtQueryResponse(int transactionId, byte[] nbt)
    {
        this.transactionId = transactionId;
        this.nbt = nbt;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(transactionId);
        _buffer.writeBytes(nbt);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        transactionId = _buffer.readVaruint();
        nbt = _buffer.readBytes(_buffer._buffer.length-_buffer._index);
    }

    public static NbtQueryResponse fromBuffer(byte[] buffer)
    {
        NbtQueryResponse packet = new NbtQueryResponse();
        packet.safeDecode(buffer);
        return packet;
    }

}
