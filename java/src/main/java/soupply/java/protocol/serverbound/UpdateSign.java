package soupply.java.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class UpdateSign extends soupply.java.Packet
{

    public static final int ID = 28;

    public long position;
    public String[] lines;

    public UpdateSign()
    {
        this.lines = new String[4];
    }

    public UpdateSign(long position, String[] lines)
    {
        this.position = position;
        this.lines = lines;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeBigEndianLong(position);
        for(String blzm:lines)
        {
            byte[] yxb = _buffer.convertString(blzm);
            _buffer.writeVaruint((int)yxb.length);
            _buffer.writeBytes(yxb);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readBigEndianLong();
        for(int blzm=0;blzm<lines.length;blzm++)
        {
            final int bvblznyx = _buffer.readVaruint();
            lines[blzm] = _buffer.readString(bvblznyx);
        }
    }

    public static UpdateSign fromBuffer(byte[] buffer)
    {
        UpdateSign packet = new UpdateSign();
        packet.safeDecode(buffer);
        return packet;
    }

}
