package soupply.bedrock261.type;

import java.util.*;
import soupply.util.*;

public class PlayerList extends Type
{

    public soupply.bedrock261.type.McpeUuid uuid;
    public long entityId;
    public String displayName;
    public soupply.bedrock261.type.Skin skin;
    public String unknown4;

    public PlayerList()
    {
        this.uuid = new soupply.bedrock261.type.McpeUuid();
        this.skin = new soupply.bedrock261.type.Skin();
    }

    public PlayerList(soupply.bedrock261.type.McpeUuid uuid, long entityId, String displayName, soupply.bedrock261.type.Skin skin, String unknown4)
    {
        this.uuid = uuid;
        this.entityId = entityId;
        this.displayName = displayName;
        this.skin = skin;
        this.unknown4 = unknown4;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        uuid.encodeBody(_buffer);
        _buffer.writeVarlong(entityId);
        byte[] zlcxe5bu = _buffer.convertString(displayName);
        _buffer.writeVaruint((int)zlcxe5bu.length);
        _buffer.writeBytes(zlcxe5bu);
        skin.encodeBody(_buffer);
        byte[] d5b9bq = _buffer.convertString(unknown4);
        _buffer.writeVaruint((int)d5b9bq.length);
        _buffer.writeBytes(d5b9bq);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        uuid.decodeBody(_buffer);
        entityId = _buffer.readVarlong();
        final int bvzlcxe5 = _buffer.readVaruint();
        displayName = _buffer.readString(bvzlcxe5);
        skin.decodeBody(_buffer);
        final int bvd5b9bq = _buffer.readVaruint();
        unknown4 = _buffer.readString(bvd5b9bq);
    }

}
