package soupply.bedrock137.protocol.play;

import java.util.*;
import soupply.util.*;

public class PlayerSkin extends soupply.bedrock137.Packet
{

    public static final int ID = 93;

    public soupply.bedrock137.type.McpeUuid uuid;
    public String skinId;
    public String skinName;
    public String unknown3;
    public byte[] skinData;
    public byte[] capeData;
    public String geometryModel;
    public byte[] geometryData;

    public PlayerSkin()
    {
        this.uuid = new soupply.bedrock137.type.McpeUuid();
    }

    public PlayerSkin(soupply.bedrock137.type.McpeUuid uuid, String skinId, String skinName, String unknown3, byte[] skinData, byte[] capeData, String geometryModel, byte[] geometryData)
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
    public void encodeBody(Buffer _buffer)
    {
        uuid.encodeBody(_buffer);
        byte[] ctbl = _buffer.convertString(skinId);
        _buffer.writeVaruint((int)ctbl.length);
        _buffer.writeBytes(ctbl);
        byte[] ctb5bu = _buffer.convertString(skinName);
        _buffer.writeVaruint((int)ctb5bu.length);
        _buffer.writeBytes(ctb5bu);
        byte[] d5b9bm = _buffer.convertString(unknown3);
        _buffer.writeVaruint((int)d5b9bm.length);
        _buffer.writeBytes(d5b9bm);
        _buffer.writeVaruint((int)skinData.length);
        _buffer.writeBytes(skinData);
        _buffer.writeVaruint((int)capeData.length);
        _buffer.writeBytes(capeData);
        byte[] zvbvclbr = _buffer.convertString(geometryModel);
        _buffer.writeVaruint((int)zvbvclbr.length);
        _buffer.writeBytes(zvbvclbr);
        _buffer.writeVaruint((int)geometryData.length);
        _buffer.writeBytes(geometryData);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        uuid.decodeBody(_buffer);
        final int bvctbl = _buffer.readVaruint();
        skinId = _buffer.readString(bvctbl);
        final int bvctb5bu = _buffer.readVaruint();
        skinName = _buffer.readString(bvctb5bu);
        final int bvd5b9bm = _buffer.readVaruint();
        unknown3 = _buffer.readString(bvd5b9bm);
        final int bna5yr = _buffer.readVaruint();
        skinData = _buffer.readBytes(bna5yr);
        final int bncvyr = _buffer.readVaruint();
        capeData = _buffer.readBytes(bncvyr);
        final int bvzvbvcl = _buffer.readVaruint();
        geometryModel = _buffer.readString(bvzvbvcl);
        final int bdb1djrf = _buffer.readVaruint();
        geometryData = _buffer.readBytes(bdb1djrf);
    }

    public static PlayerSkin fromBuffer(byte[] buffer)
    {
        PlayerSkin packet = new PlayerSkin();
        packet.safeDecode(buffer);
        return packet;
    }

}
