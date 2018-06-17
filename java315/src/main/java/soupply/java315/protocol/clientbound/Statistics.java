package soupply.java315.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class Statistics extends soupply.java315.Packet
{

    public static final int ID = 7;

    public soupply.java315.type.Statistic[] statistics;

    public Statistics()
    {
    }

    public Statistics(soupply.java315.type.Statistic[] statistics)
    {
        this.statistics = statistics;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)statistics.length);
        for(soupply.java315.type.Statistic crdldlc:statistics)
        {
            crdldlc.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bnyrcrym = _buffer.readVaruint();
        for(int crdldlc=0;crdldlc<statistics.length;crdldlc++)
        {
            statistics[crdldlc].decodeBody(_buffer);
        }
    }

    public static Statistics fromBuffer(byte[] buffer)
    {
        Statistics packet = new Statistics();
        packet.safeDecode(buffer);
        return packet;
    }

}
