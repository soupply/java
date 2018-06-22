package soupply.java340.type;

import java.util.*;
import soupply.util.*;

public class ListAddPlayer extends Type
{

    // gamemode
    public static final int SURVIVAL = (int)0;
    public static final int CREATIVE = (int)1;
    public static final int ADVENTURE = (int)2;
    public static final int SPECTATOR = (int)3;

    public UUID uuid;
    public String name;
    public soupply.java340.type.Property[] properties;
    public int gamemode;
    public int latency;
    public boolean hasDisplayName;
    public String displayName;

    public ListAddPlayer()
    {
        this.uuid = new UUID(0, 0);
    }

    public ListAddPlayer(UUID uuid, String name, soupply.java340.type.Property[] properties, int gamemode, int latency, boolean hasDisplayName, String displayName)
    {
        this.uuid = uuid;
        this.name = name;
        this.properties = properties;
        this.gamemode = gamemode;
        this.latency = latency;
        this.hasDisplayName = hasDisplayName;
        this.displayName = displayName;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeUUID(uuid);
        byte[] bfz = _buffer.convertString(name);
        _buffer.writeVaruint((int)bfz.length);
        _buffer.writeBytes(bfz);
        _buffer.writeVaruint((int)properties.length);
        for(soupply.java340.type.Property cjcvdlc:properties)
        {
            cjcvdlc.encodeBody(_buffer);
        }
        _buffer.writeVaruint(gamemode);
        _buffer.writeVaruint(latency);
        _buffer.writeBool(hasDisplayName);
        if(hasDisplayName==true)
        {
            byte[] zlcxe5bu = _buffer.convertString(displayName);
            _buffer.writeVaruint((int)zlcxe5bu.length);
            _buffer.writeBytes(zlcxe5bu);
        }
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        uuid = _buffer.readUUID();
        final int bvbfz = _buffer.readVaruint();
        name = _buffer.readString(bvbfz);
        final int bbbbcrzm = _buffer.readVaruint();
        properties = new soupply.java340.type.Property[bbbbcrzm];
        for(int cjcvdlc=0;cjcvdlc<properties.length;cjcvdlc++)
        {
            properties[cjcvdlc].decodeBody(_buffer);
        }
        gamemode = _buffer.readVaruint();
        latency = _buffer.readVaruint();
        hasDisplayName = _buffer.readBool();
        if(hasDisplayName==true)
        {
            final int bvzlcxe5 = _buffer.readVaruint();
            displayName = _buffer.readString(bvzlcxe5);
        }
    }

}
