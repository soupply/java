package soupply.java338.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class TabComplete extends soupply.java338.Packet
{

    public static final int ID = 14;

    public String[] matches;

    public TabComplete()
    {
    }

    public TabComplete(String[] matches)
    {
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
        _buffer.writeVaruint((int)matches.length);
        for(String bfyhc:matches)
        {
            byte[] yzam = _buffer.convertString(bfyhc);
            _buffer.writeVaruint((int)yzam.length);
            _buffer.writeBytes(yzam);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int b1dnzm = _buffer.readVaruint();
        for(int bfyhc=0;bfyhc<matches.length;bfyhc++)
        {
            final int bvbfyhct = _buffer.readVaruint();
            matches[bfyhc] = _buffer.readString(bvbfyhct);
        }
    }

    public static TabComplete fromBuffer(byte[] buffer)
    {
        TabComplete packet = new TabComplete();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
