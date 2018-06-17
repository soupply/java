package soupply.bedrock.type;

import java.util.*;
import soupply.util.*;

public class PlayerList extends Type
{

    public soupply.bedrock.type.McpeUuid uuid;
    public long entityId;
    public String displayName;
    public soupply.bedrock.type.Skin skin;
    public String unknown4;

    public PlayerList()
    {
        this.uuid = new soupply.bedrock.type.McpeUuid();
        this.skin = new soupply.bedrock.type.Skin();
    }

    public PlayerList(soupply.bedrock.type.McpeUuid uuid, long entityId, String displayName, soupply.bedrock.type.Skin skin, String unknown4)
    {
        this.uuid = uuid;
        this.entityId = entityId;
        this.displayName = displayName;
        this.skin = skin;
        this.unknown4 = unknown4;
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
