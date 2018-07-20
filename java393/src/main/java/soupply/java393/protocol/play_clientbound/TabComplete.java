package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class TabComplete extends soupply.java393.Packet
{

    public static final int ID = 16;

    public int transactionId;
    public int start;
    public int end;
    public soupply.java393.type.Match[] matches;

    public TabComplete()
    {
    }

    public TabComplete(int transactionId, int start, int end, soupply.java393.type.Match[] matches)
    {
        this.transactionId = transactionId;
        this.start = start;
        this.end = end;
        this.matches = matches;
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
        _buffer.writeVaruint(start);
        _buffer.writeVaruint(end);
        _buffer.writeVaruint((int)matches.length);
        for(soupply.java393.type.Match bfyhc:matches)
        {
            bfyhc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        transactionId = _buffer.readVaruint();
        start = _buffer.readVaruint();
        end = _buffer.readVaruint();
        final int b1dnzm = _buffer.readVaruint();
        matches = new soupply.java393.type.Match[b1dnzm];
        for(int bfyhc=0;bfyhc<matches.length;bfyhc++)
        {
            matches[bfyhc].decodeBody(_buffer);
        }
    }

    public static TabComplete fromBuffer(byte[] buffer)
    {
        TabComplete packet = new TabComplete();
        packet.safeDecode(buffer);
        return packet;
    }

}
