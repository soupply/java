package soupply.bedrock137.play;

import java.util.*;
import soupply.util.*;

class CommandRequest extends soupply.bedrock137.Packet
{

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

}
