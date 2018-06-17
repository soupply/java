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
    public void encodeBody(Buffer buffer)
    {
    }

    @Override
    public void decodeBody(Buffer buffer) throws BufferOverflowException
    {
    }

}
