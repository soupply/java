package soupply.java338.protocol.serverbound;

import java.util.*;
import soupply.util.*;

public class TeleportConfirm extends soupply.java338.Packet
{

    public static final int ID = 0;

    public int teleportId;

    public TeleportConfirm()
    {
    }

    public TeleportConfirm(int teleportId)
    {
        this.teleportId = teleportId;
    }

    @Override
    public int getId()
    {
        return ID;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeVaruint(teleportId);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws BufferOverflowException
    {
        teleportId = _buffer.readVaruint();
    }

    public static TeleportConfirm fromBuffer(byte[] buffer)
    {
        TeleportConfirm packet = new TeleportConfirm();
        packet.safeDecode(buffer);
        return packet;
    }

}
