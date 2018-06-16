package soupply.bedrock141.type;

import java.util.*;
import soupply.util.*;

class PlayerList extends Type
{

    public soupply.bedrock141.type.McpeUuid uuid;
    public long entityId;
    public String displayName;
    public soupply.bedrock141.type.Skin skin;
    public String unknown4;

    public PlayerList()
    {
        this.uuid = new soupply.bedrock141.type.McpeUuid();
        this.skin = new soupply.bedrock141.type.Skin();
    }

    public PlayerList(soupply.bedrock141.type.McpeUuid uuid, long entityId, String displayName, soupply.bedrock141.type.Skin skin, String unknown4)
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
    public void decodeBody(Buffer buffer)
    {
    }

}
