package soupply.java393.type;

import java.util.*;
import soupply.util.*;

public class ListUpdateLatency extends Type
{

    public UUID uuid;
    public int latency;

    public ListUpdateLatency()
    {
        this.uuid = new UUID(0, 0);
    }

    public ListUpdateLatency(UUID uuid, int latency)
    {
        this.uuid = uuid;
        this.latency = latency;
    }

    @Override
    public void encodeBody(Buffer _buffer)
    {
        _buffer.writeUUID(uuid);
        _buffer.writeVaruint(latency);
    }

    @Override
    public void decodeBody(Buffer _buffer) throws DecodeException
    {
        uuid = _buffer.readUUID();
        latency = _buffer.readVaruint();
    }

}
