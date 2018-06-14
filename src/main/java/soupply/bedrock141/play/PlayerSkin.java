package soupply.bedrock141.play;

import java.util.*;
import soupply.util.*;

class PlayerSkin extends soupply.bedrock141.Packet
{

    public soupply.bedrock141.type.McpeUuid uuid;
    public String skinId;
    public String skinName;
    public String unknown3;
    public byte[] skinData;
    public byte[] capeData;
    public String geometryModel;
    public byte[] geometryData;

    public PlayerSkin()
    {
    }

    public PlayerSkin(soupply.bedrock141.type.McpeUuid uuid, String skinId, String skinName, String unknown3, byte[] skinData, byte[] capeData, String geometryModel, byte[] geometryData)
    {
        this.uuid = uuid;
        this.skinId = skinId;
        this.skinName = skinName;
        this.unknown3 = unknown3;
        this.skinData = skinData;
        this.capeData = capeData;
        this.geometryModel = geometryModel;
        this.geometryData = geometryData;
    }

}
