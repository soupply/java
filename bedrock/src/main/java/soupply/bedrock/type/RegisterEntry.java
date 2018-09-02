package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class RegisterEntry extends Type
{

    public long scoreboardId;
    public UUID uuid;

    public RegisterEntry()
    {
        this.uuid = new UUID(0, 0);
    }

    public RegisterEntry(long scoreboardId, UUID uuid)
    {
        this.scoreboardId = scoreboardId;
        this.uuid = uuid;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVarlong(scoreboardId);
        _buffer.writeUUID(uuid);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        scoreboardId = _buffer.readVarlong();
        uuid = _buffer.readUUID();
    }

}
