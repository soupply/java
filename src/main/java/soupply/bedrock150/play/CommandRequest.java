package soupply.bedrock150.play;

import java.util.*;
import soupply.util.*;

class CommandRequest extends soupply.bedrock150.Packet
{

    // type
    public static final int PLAYER = 0;
    public static final int COMMAND_BLOCK = 1;
    public static final int MINECART_COMMAND_BLOCK = 2;
    public static final int DEV_CONSOLE = 3;

    public String command;
    public int type;
    public soupply.bedrock150.type.McpeUuid uuid;
    public String requestId;
    public int playerId;
    public boolean internal;

    public CommandRequest()
    {
    }

    public CommandRequest(String command, int type, soupply.bedrock150.type.McpeUuid uuid, String requestId, int playerId, boolean internal)
    {
        this.command = command;
        this.type = type;
        this.uuid = uuid;
        this.requestId = requestId;
        this.playerId = playerId;
        this.internal = internal;
    }

}
