package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class CommandOriginData extends Type
{

    // type
    public static final int PLAYER = (int)0;
    public static final int BLOCK = (int)1;
    public static final int MINECART_BLOCK = (int)2;
    public static final int DEV_CONSOLE = (int)3;
    public static final int TEST = (int)4;
    public static final int AUTOMATION_PLAYER = (int)5;
    public static final int CLIENT_AUTOMATION = (int)6;
    public static final int DEDICATED_SERVER = (int)7;
    public static final int ENTITY = (int)8;
    public static final int VIRTUAL = (int)9;
    public static final int GAME_ARGUMENT = (int)10;
    public static final int ENTITY_SERVER = (int)11;

    public int type;
    public UUID uuid;
    public String requestId;
    public long unknown3;

    public CommandOriginData()
    {
        this.uuid = new UUID(0, 0);
    }

    public CommandOriginData(int type, UUID uuid, String requestId, long unknown3)
    {
        this.type = type;
        this.uuid = uuid;
        this.requestId = requestId;
        this.unknown3 = unknown3;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(type);
        _buffer.writeUUID(uuid);
        byte[] cvdvdl = _buffer.convertString(requestId);
        _buffer.writeVaruint((int)cvdvdl.length);
        _buffer.writeBytes(cvdvdl);
        if(type==3||type==4)
        {
            _buffer.writeVarlong(unknown3);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        type = _buffer.readVaruint();
        uuid = _buffer.readUUID();
        final int bvcvdvdl = _buffer.readVaruint();
        requestId = _buffer.readString(bvcvdvdl);
        if(type==3||type==4)
        {
            unknown3 = _buffer.readVarlong();
        }
    }

}
