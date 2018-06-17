package soupply.java335.protocol.clientbound;

import java.util.*;
import soupply.util.*;

public class UpdateScore extends soupply.java335.Packet
{

    public static final int ID = 68;

    // action
    public static final byte UPDATE = (byte)0;
    public static final byte REMOVE = (byte)1;

    public String scoreName;
    public byte action;
    public String objectiveName;
    public int value;

    public UpdateScore()
    {
    }

    public UpdateScore(String scoreName, byte action, String objectiveName, int value)
    {
        this.scoreName = scoreName;
        this.action = action;
        this.objectiveName = objectiveName;
        this.value = value;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        byte[] cncvy1 = _buffer.convertString(scoreName);
        _buffer.writeVaruint((int)cncvy1.length);
        _buffer.writeBytes(cncvy1);
        _buffer.writeBigEndianByte(action);
        byte[] bjznaztf = _buffer.convertString(objectiveName);
        _buffer.writeVaruint((int)bjznaztf.length);
        _buffer.writeBytes(bjznaztf);
        _buffer.writeVaruint(value);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        final int bvcncvy1 = _buffer.readVaruint();
        scoreName = _buffer.readString(bvcncvy1);
        action = _buffer.readBigEndianByte();
        final int bvbjznaz = _buffer.readVaruint();
        objectiveName = _buffer.readString(bvbjznaz);
        value = _buffer.readVaruint();
    }

    public static UpdateScore fromBuffer(byte[] buffer)
    {
        UpdateScore packet = new UpdateScore();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
