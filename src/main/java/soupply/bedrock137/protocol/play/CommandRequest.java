package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

class CommandRequest extends soupply.bedrock137.Packet
{

    public static final int ID = 77;

    // type
    public static final int PLAYER = 0;
    public static final int COMMAND_BLOCK = 1;
    public static final int MINECART_COMMAND_BLOCK = 2;
    public static final int DEV_CONSOLE = 3;

    public String command;
    public int type;
    public String requestId;
    public int playerId;

    public CommandRequest()
    {
    }

    public CommandRequest(String command, int type, String requestId, int playerId)
    {
        this.command = command;
        this.type = type;
        this.requestId = requestId;
        this.playerId = playerId;
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
