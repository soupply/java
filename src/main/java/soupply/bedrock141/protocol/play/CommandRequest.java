package soupply.bedrock141.protocol.play;

import java.util.*;
import soupply.util.*;

class CommandRequest extends soupply.bedrock141.Packet
{

    public static final int ID = 77;

    // type
    public static final int PLAYER = 0;
    public static final int COMMAND_BLOCK = 1;
    public static final int MINECART_COMMAND_BLOCK = 2;
    public static final int DEV_CONSOLE = 3;

    public String command;
    public int type;
    public soupply.bedrock141.type.McpeUuid uuid;
    public String requestId;
    public int playerId;
    public boolean internal;

    public CommandRequest()
    {
    }

    public CommandRequest(String command, int type, soupply.bedrock141.type.McpeUuid uuid, String requestId, int playerId, boolean internal)
    {
        this.command = command;
        this.type = type;
        this.uuid = uuid;
        this.requestId = requestId;
        this.playerId = playerId;
        this.internal = internal;
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
    public void decodeBody(Buffer buffer)
    {
    }

}
