package soupply.bedrock160.protocol.play;

import java.util.*;
import soupply.util.*;

class PlayerSkin extends soupply.bedrock160.Packet
{

    public static final int ID = 93;

    public soupply.bedrock160.type.McpeUuid uuid;
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

    public PlayerSkin(soupply.bedrock160.type.McpeUuid uuid, String skinId, String skinName, String unknown3, byte[] skinData, byte[] capeData, String geometryModel, byte[] geometryData)
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
