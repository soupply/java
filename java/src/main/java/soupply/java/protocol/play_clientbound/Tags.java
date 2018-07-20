package soupply.java.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class Tags extends soupply.java.Packet
{

    public static final int ID = 85;

    public soupply.java.type.Tag[] blockTags;
    public soupply.java.type.Tag[] itemTags;
    public soupply.java.type.Tag[] fluidTags;

    public Tags()
    {
    }

    public Tags(soupply.java.type.Tag[] blockTags, soupply.java.type.Tag[] itemTags, soupply.java.type.Tag[] fluidTags)
    {
        this.blockTags = blockTags;
        this.itemTags = itemTags;
        this.fluidTags = fluidTags;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint((int)blockTags.length);
        for(soupply.java.type.Tag yxytyd:blockTags)
        {
            yxytyd.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)itemTags.length);
        for(soupply.java.type.Tag arbrzm:itemTags)
        {
            arbrzm.encodeBody(_buffer);
        }
        _buffer.writeVaruint((int)fluidTags.length);
        for(soupply.java.type.Tag zxaryd:fluidTags)
        {
            zxaryd.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bjbnvfc = _buffer.readVaruint();
        blockTags = new soupply.java.type.Tag[bjbnvfc];
        for(int yxytyd=0;yxytyd<blockTags.length;yxytyd++)
        {
            blockTags[yxytyd].decodeBody(_buffer);
        }
        final int blz1yd = _buffer.readVaruint();
        itemTags = new soupply.java.type.Tag[blz1yd];
        for(int arbrzm=0;arbrzm<itemTags.length;arbrzm++)
        {
            itemTags[arbrzm].decodeBody(_buffer);
        }
        final int bzdlvfc = _buffer.readVaruint();
        fluidTags = new soupply.java.type.Tag[bzdlvfc];
        for(int zxaryd=0;zxaryd<fluidTags.length;zxaryd++)
        {
            fluidTags[zxaryd].decodeBody(_buffer);
        }
    }

    public static Tags fromBuffer(byte[] buffer)
    {
        Tags packet = new Tags();
        packet.safeDecode(buffer);
        return packet;
    }

}
