package soupply.bedrock282.protocol.play;

import java.util.*;
import soupply.util.*;

public class UpdateSoftEnum extends soupply.bedrock282.Packet
{

    public static final int ID = 114;

    // type
    public static final byte ADD = (byte)0;
    public static final byte REMOVE = (byte)1;
    public static final byte SET = (byte)2;

    public String name;
    public String[] values;
    public byte type;

    public UpdateSoftEnum()
    {
    }

    public UpdateSoftEnum(String name, String[] values, byte type)
    {
        this.name = name;
        this.values = values;
        this.type = type;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeVaruint((int)values.length);
        for(String dfdv:values)
        {
            byte[] zzd = _buffer.convertString(dfdv);
            _buffer.writeVaruint((int)zzd.length);
            _buffer.writeBytes(zzd);
        }
        _buffer.writeByte(type);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int bzbvc = _buffer.readVaruint();
        values = new String[bzbvc];
        for(int dfdv=0;dfdv<values.length;dfdv++)
        {
            final int bvdfdvwr = _buffer.readVaruint();
            values[dfdv] = _buffer.readString(bvdfdvwr);
        }
        type = _buffer.readByte();
    }

    public static UpdateSoftEnum fromBuffer(byte[] buffer)
    {
        UpdateSoftEnum packet = new UpdateSoftEnum();
        packet.safeDecode(buffer);
        return packet;
    }

}
