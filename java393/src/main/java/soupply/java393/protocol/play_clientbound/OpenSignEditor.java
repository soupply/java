package soupply.java393.protocol.play_clientbound;

import java.util.*;
import soupply.util.*;

public class OpenSignEditor extends soupply.java393.Packet
{

    public static final int ID = 44;

    public long position;

    public OpenSignEditor()
    {
    }

    public OpenSignEditor(long position)
    {
        this.position = position;
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
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        position = _buffer.readBigEndianLong();
    }

    public static OpenSignEditor fromBuffer(byte[] buffer)
    {
        OpenSignEditor packet = new OpenSignEditor();
        packet.safeDecode(buffer);
        return packet;
    }

}
