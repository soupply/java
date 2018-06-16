package soupply.bedrock201.type;

import java.util.*;
import soupply.util.*;

class PlayerList extends Type
{

    public soupply.bedrock201.type.McpeUuid uuid;
    public long entityId;
    public String displayName;
    public soupply.bedrock201.type.Skin skin;
    public String unknown4;

    public PlayerList()
    {
        this.uuid = new soupply.bedrock201.type.McpeUuid();
        this.skin = new soupply.bedrock201.type.Skin();
    }

    public PlayerList(soupply.bedrock201.type.McpeUuid uuid, long entityId, String displayName, soupply.bedrock201.type.Skin skin, String unknown4)
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
