package soupply.bedrock.protocol.play;

import java.util.*;
import soupply.util.*;

public class CommandOutput extends soupply.bedrock.Packet
{

    public static final int ID = 79;

    public soupply.bedrock.type.CommandOriginData originData;
    public byte outputType;
    public int successCount;
    public soupply.bedrock.type.CommandMessage[] messages;
    public String unknown4;

    public CommandOutput()
    {
        this.originData = new soupply.bedrock.type.CommandOriginData();
    }

    public CommandOutput(soupply.bedrock.type.CommandOriginData originData, byte outputType, int successCount, soupply.bedrock.type.CommandMessage[] messages, String unknown4)
    {
        this.originData = originData;
        this.outputType = outputType;
        this.successCount = successCount;
        this.messages = messages;
        this.unknown4 = unknown4;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        originData.encodeBody(_buffer);
        _buffer.writeByte(outputType);
        _buffer.writeVaruint(successCount);
        _buffer.writeVaruint((int)messages.length);
        for(soupply.bedrock.type.CommandMessage bvcfzm:messages)
        {
            bvcfzm.encodeBody(_buffer);
        }
        byte[] d5b9bq = _buffer.convertString(unknown4);
        _buffer.writeVaruint((int)d5b9bq.length);
        _buffer.writeBytes(d5b9bq);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        originData.decodeBody(_buffer);
        outputType = _buffer.readByte();
        successCount = _buffer.readVaruint();
        final int b1cnzv = _buffer.readVaruint();
        for(int bvcfzm=0;bvcfzm<messages.length;bvcfzm++)
        {
            messages[bvcfzm].decodeBody(_buffer);
        }
        final int bvd5b9bq = _buffer.readVaruint();
        unknown4 = _buffer.readString(bvd5b9bq);
    }

    public static CommandOutput fromBuffer(byte[] buffer)
    {
        CommandOutput packet = new CommandOutput();
        packet.safeDecode(buffer);
        return packet;
    }

}
