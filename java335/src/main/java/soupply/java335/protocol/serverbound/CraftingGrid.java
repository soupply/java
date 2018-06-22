package soupply.java335.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class CraftingGrid extends soupply.java335.Packet
{

    public static final int ID = 1;

    public byte window;
    public short action;
    public soupply.java335.type.Entry[] returnEntry;
    public soupply.java335.type.Entry[] prepareEntry;

    public CraftingGrid()
    {
    }

    public CraftingGrid(byte window, short action, soupply.java335.type.Entry[] returnEntry, soupply.java335.type.Entry[] prepareEntry)
    {
        this.window = window;
        this.action = action;
        this.returnEntry = returnEntry;
        this.prepareEntry = prepareEntry;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeByte(window);
        _buffer.writeBigEndianShort(action);
        _buffer.writeBigEndianShort((short)returnEntry.length);
        for(soupply.java335.type.Entry cvdjr5ck:returnEntry)
        {
            cvdjr5ck.encodeBody(_buffer);
        }
        _buffer.writeBigEndianShort((short)prepareEntry.length);
        for(soupply.java335.type.Entry cjcfzvdj:prepareEntry)
        {
            cjcfzvdj.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        window = _buffer.readByte();
        action = _buffer.readBigEndianShort();
        final int bjdvbvdj = _buffer.readBigEndianShort();
        returnEntry = new soupply.java335.type.Entry[bjdvbvdj];
        for(int cvdjr5ck=0;cvdjr5ck<returnEntry.length;cvdjr5ck++)
        {
            returnEntry[cvdjr5ck].decodeBody(_buffer);
        }
        final int bbzbcvbr = _buffer.readBigEndianShort();
        prepareEntry = new soupply.java335.type.Entry[bbzbcvbr];
        for(int cjcfzvdj=0;cjcfzvdj<prepareEntry.length;cjcfzvdj++)
        {
            prepareEntry[cjcfzvdj].decodeBody(_buffer);
        }
    }

    public static CraftingGrid fromBuffer(byte[] buffer)
    {
        CraftingGrid packet = new CraftingGrid();
        packet.safeDecode(buffer);
        return packet;
    }

}
