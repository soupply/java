package soupply.java.protocol.play_serverbound;

import java.util.*;
import soupply.util.*;

public class UpdateCommandBlockMinecart extends soupply.java.Packet
{

    public static final int ID = 35;

    public int entityId;
    public String command;
    public boolean trackOutput;

    public UpdateCommandBlockMinecart()
    {
    }

    public UpdateCommandBlockMinecart(int entityId, String command, boolean trackOutput)
    {
        this.entityId = entityId;
        this.command = command;
        this.trackOutput = trackOutput;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(entityId);
        byte[] y9bfz = _buffer.convertString(command);
        _buffer.writeVaruint((int)y9bfz.length);
        _buffer.writeBytes(y9bfz);
        _buffer.writeBool(trackOutput);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        entityId = _buffer.readVaruint();
        final int bvy9bfz = _buffer.readVaruint();
        command = _buffer.readString(bvy9bfz);
        trackOutput = _buffer.readBool();
    }

    public static UpdateCommandBlockMinecart fromBuffer(byte[] buffer)
    {
        UpdateCommandBlockMinecart packet = new UpdateCommandBlockMinecart();
        packet.safeDecode(buffer);
        return packet;
    }

}
