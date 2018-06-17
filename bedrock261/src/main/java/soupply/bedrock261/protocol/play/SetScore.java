package soupply.bedrock261.protocol.play;

import java.util.*;
import soupply.util.*;

public class SetScore extends soupply.bedrock261.Packet
{

    public static final int ID = 108;

    // type
    public static final byte MODIFY = (byte)0;
    public static final byte RESET = (byte)1;

    public byte type;
    public soupply.bedrock261.type.Score[] scores;

    public SetScore()
    {
    }

    public SetScore(byte type, soupply.bedrock261.type.Score[] scores)
    {
        this.type = type;
        this.scores = scores;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeLittleEndianByte(type);
        _buffer.writeVaruint((int)scores.length);
        for(soupply.bedrock261.type.Score cncv:scores)
        {
            cncv.encodeBody(_buffer);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readLittleEndianByte();
        final int bnbjc = _buffer.readVaruint();
        for(int cncv=0;cncv<scores.length;cncv++)
        {
            scores[cncv].decodeBody(_buffer);
        }
    }

    public static SetScore fromBuffer(byte[] buffer)
    {
        SetScore packet = new SetScore();
        packet.safeDecode(new Buffer(buffer));
        return packet;
    }

}
